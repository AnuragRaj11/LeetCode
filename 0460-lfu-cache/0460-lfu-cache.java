class LFUCache {
    private int capacity;
    private int minf = 0;

    private Map<Integer, Integer> Ktv = new HashMap<>();
    private Map<Integer, Integer> Ktf = new HashMap<>();
    private Map<Integer, LinkedHashSet<Integer>> ftk = new HashMap<>();

    public LFUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!Ktv.containsKey(key)) return -1;

        int freq = Ktf.get(key);
        ftk.get(freq).remove(key);

        if (freq == minf && ftk.get(freq).isEmpty()) {
            ftk.remove(freq);
            minf++;
        }

        putf(key, freq + 1);
        return Ktv.get(key);
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (Ktv.containsKey(key)) {
            Ktv.put(key, value);
            get(key);
            return;
        }

        if (Ktv.size() == capacity) {
            int evictKey = ftk.get(minf).iterator().next();
            ftk.get(minf).remove(evictKey);
            if (ftk.get(minf).isEmpty()) ftk.remove(minf);
            Ktv.remove(evictKey);
            Ktf.remove(evictKey);
        }

        Ktv.put(key, value);
        Ktf.put(key, 1);
        ftk.computeIfAbsent(1, z -> new LinkedHashSet<>()).add(key);
        minf = 1;
    }

    private void putf(int key, int freq) {
        Ktf.put(key, freq);
        ftk.computeIfAbsent(freq, z -> new LinkedHashSet<>()).add(key);
    }
}

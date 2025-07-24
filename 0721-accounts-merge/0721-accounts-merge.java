class Solution {
    Map<String, String> p = new HashMap<>(), name = new HashMap<>();

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        for (var a : accounts) {
            String firstEmail = a.get(1);
            for (int i = 1; i < a.size(); i++) {
                String email = a.get(i);
                p.putIfAbsent(email, email);
                name.put(email, a.get(0));
                union(firstEmail, email);
            }
        }

        Map<String, TreeSet<String>> groups = new HashMap<>();
        for (String email : p.keySet()) {
            String root = find(email);
            groups.computeIfAbsent(root, x -> new TreeSet<>()).add(email);
        }

        List<List<String>> ans = new ArrayList<>();
        for (var e : groups.entrySet()) {
            List<String> l = new ArrayList<>();
            l.add(name.get(e.getKey()));
            l.addAll(e.getValue());
            ans.add(l);
        }
        return ans;
    }

    String find(String x) {
        if (!x.equals(p.get(x))) {
            p.put(x, find(p.get(x)));
        }
        return p.get(x);
    }

    void union(String a, String b) {
        p.put(find(a), find(b));
    }
}

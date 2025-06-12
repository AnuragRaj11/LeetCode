class Solution {
    public int[] recoverArray(int n, int[] sums) {
        List<Integer> result=new ArrayList<>();
        List<Integer> sumList=new ArrayList<>();
        for(int s: sums) sumList.add(s);
        Collections.sort(sumList);
        recover(n,sumList,result);
        return result.stream().mapToInt(i -> i).toArray();
    }
    public void recover(int n,List<Integer> sums,List<Integer>result){
        if (n==0) return;
        Collections.sort(sums);
        int diff = sums.get(1)-sums.get(0);
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num:sums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        List<Integer> with = new ArrayList<>();
        List<Integer> without = new ArrayList<>();
        for(int num:sums){
            if (freq.get(num)==0) continue;
            int paired = num+diff;
            if (freq.getOrDefault(paired,0)>0){
                without.add(num);
                with.add(paired);
                freq.put(num,freq.get(num)-1);
                freq.put(paired,freq.get(paired)-1);
            }
        }
        if(without.contains(0)){
            result.add(diff);
            recover(n-1, without, result);
        }
        else {
            result.add(-diff);
            recover(n-1, with, result);
        }
    }
}
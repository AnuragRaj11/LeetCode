class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq=0,cnt=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        for(int val:mp.values()){
            if(val==freq){
                cnt++;
            }
            else if(val>freq){
                freq=val;
                cnt=1;
            }
        }
        return freq*cnt;
    }
}
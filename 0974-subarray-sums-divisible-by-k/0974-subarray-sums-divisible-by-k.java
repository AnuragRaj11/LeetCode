class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int sum=0,cnt=0;
        for(int x:nums){
            sum+=x;
            int rem=sum%k;
            if(rem<0) rem+=k;
            if(mp.containsKey(rem)){
                cnt+=mp.get(rem);
            }
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
}
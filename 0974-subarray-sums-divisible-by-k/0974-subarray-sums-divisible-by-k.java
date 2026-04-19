class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int sum=0,cnt=0;
        for(int x:nums){
            sum+=x;
            int rem=((sum%k+k)%k);
            cnt+=mp.getOrDefault(rem,0);
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
}
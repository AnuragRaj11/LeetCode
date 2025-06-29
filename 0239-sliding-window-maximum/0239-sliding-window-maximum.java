class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans=new ArrayList<>();
        Deque<Integer> deq=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
        while(!deq.isEmpty() && deq.getLast()<n){
            deq.pollLast();
        }
        deq.addLast(n);
        if(i>=k && nums[i-k] ==deq.getFirst()){
            deq.pollFirst();
        }
        if(i>=k-1){
            ans.add(deq.getFirst());
        }
        }
    return ans.stream().mapToInt(i->i).toArray();
    }
}
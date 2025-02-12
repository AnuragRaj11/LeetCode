class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        comb(candidates, target, 0, new ArrayList<>());
        return result;
    }
    private void comb(int[] candidates, int tar,int ind,List<Integer> curc){
        if(tar==0){
            result.add(new ArrayList<>(curc));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
           if(candidates[i]>tar) break;
           if(i>ind && candidates[i]==candidates[i-1]) continue;
            curc.add(candidates[i]);
            comb(candidates,tar-candidates[i],i+1,curc);
            curc.remove(curc.size()-1);
        }
    }
}
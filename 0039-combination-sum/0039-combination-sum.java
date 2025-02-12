class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        comb(candidates, target, 0, new ArrayList<>());
        return result;

    }
    private void comb(int[] candidates, int curtar,int pos,List<Integer> curc){
        if(curtar==0){
            result.add(new ArrayList<>(curc));
            return;
        }
        if(pos==candidates.length){
            return;
        }
        if(candidates[pos]<=curtar){
            curc.add(candidates[pos]);
            comb(candidates,curtar-candidates[pos],pos,curc);
            curc.remove(curc.size()-1);
        }
        comb(candidates,curtar,pos+1,curc);
    }
}
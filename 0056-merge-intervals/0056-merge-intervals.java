class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals,Comparator.comparingInt (i->i[0]));
        List <int[]> res=new ArrayList <>();
        int[] newi=intervals[0];
        res.add(newi);
        for(int[] i:intervals){
            if(i[0]<=newi[1])
            newi[1]=Math.max(newi[1],i[1]);
            else{
                newi=i;
                res.add(newi);
            }
        }
        return res.toArray(new int [res.size()] []);
    }
}
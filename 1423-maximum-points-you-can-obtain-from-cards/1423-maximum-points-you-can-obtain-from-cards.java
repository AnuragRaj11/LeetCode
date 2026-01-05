class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int w=cardPoints.length;
        int s=cardPoints.length-k;
        int sum=0;
        int tot=0;
        for(int x:cardPoints) tot+=x;
        for(int i=0;i<s;i++){
            sum+=cardPoints[i];
        }
        int min=sum;
        for(int i=s;i<w;i++){
            sum+=cardPoints[i];
            sum-=cardPoints[i-s];
            min=Math.min(min,sum);
        }
        return tot-min;
    }
}
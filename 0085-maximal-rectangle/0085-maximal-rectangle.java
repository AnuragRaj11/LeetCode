class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
        return 0;
        int rs=matrix.length;
        int cl=matrix[0].length;
        int[] h=new int[cl+1];
        int max=0;
        for(char[] r:matrix){
            for(int i=0;i<cl;i++){
                h[i]=(r[i]=='1') ? h[i]+1:0;
            }
            Stack<Integer> st=new Stack<>();
            for(int i=0;i<h.length;i++){
                while(!st.isEmpty() && h[i]<h[st.peek()]){
                    int ht=h[st.pop()];
                    int w=st.isEmpty() ?i:i-st.peek()-1;
                    max=Math.max(max,ht*w);
                }
                st.push(i);
            }
        }
        return max;
    }
}
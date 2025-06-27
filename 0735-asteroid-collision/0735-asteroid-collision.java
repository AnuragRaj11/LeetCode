class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int a: asteroids){
            boolean dest=false;
            while(!st.isEmpty() && a<0 && st.peek()>0){
                if(st.peek()<-a){
                    st.pop();
                }
                else if(st.peek()==-a){
                    st.pop();
                    dest=true;
                    break;
                }
                else{
                    dest=true;
                    break;
                }
            }
                if(!dest){
                    st.push(a);
            }
        }
            int[] ans=new int[st.size()];
            for(int i=ans.length-1;i>=0;i--){
                ans[i]=st.pop();
            }
        return ans;
    }
}
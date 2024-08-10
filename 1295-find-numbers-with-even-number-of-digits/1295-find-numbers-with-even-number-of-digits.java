class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int num:nums){
            if(even(num)){
                c++;
            }
        }
        return c;}
        boolean even(int num){
            int nod=digits(num);
            return nod%2==0;
        }
        int  digits (int num){
            if(num<0){
                num=num*-1;
            }
            return (int) (Math.log10(num))+1;
        } 
    
}
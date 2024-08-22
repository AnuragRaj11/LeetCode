class Solution {
    public char findTheDifference(String s, String t) {
        char xor=0;
        for(char xors:s.toCharArray()) xor^=xors;
        for(char xort:t.toCharArray()) xor^=xort;
        return xor;
    }
}
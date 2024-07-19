class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            for(int j=i+1;j<=haystack.length();j++){
                String substr=haystack.substring(i,j);
                if(substr.equals(needle))return i;

            }
        }
        return -1;
    }
}
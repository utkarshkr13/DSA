class Solution {
    public int lengthOfLastWord(String s) {
        int a = s.length();
        int len = 0;
        for(int i=a-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                len++;
            }
            if(a>1 && i!=0 && s.charAt(i-1)==' ' && len>0){
                break;
            }



        }
        return len;
        
    }
}
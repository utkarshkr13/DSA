import java.util.*;

public class lastsubstring {
    public static void String lastSubstring_yes(String s) {
        int a = s.length();
        String str1 = s.substring(0,a-1);
        String m = new String();
        int b =0;
        for(int i=1;i<a+1;i++){
            String str2 = s.substring(0,i);
            int c = str1.compareTo(str2);
            if(c>0){
                m=str1;
            }
            if(c<0){
                m=str2;
                str1=str2;
            }
        }
        return m;
        
    }
    System.out.println(lastsubstring_yes('abab'));
}
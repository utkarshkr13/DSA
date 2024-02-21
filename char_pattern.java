import java.util.*;
public class char_pattern {
    public static void main(String[] args) {
        int n =4;
        char ch = 'A';

        //outer loop
        for (int line=1;line<=n;line++){
            //inner loop
            for (int a=0;a<=line;a++){
                System.err.print(ch);
                ch++;
            }
            System.err.println();
        }

    }
    
}

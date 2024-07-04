import java.util.*;
public class getithbit {
    public static int getbit(int n, int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(getbit(10, 3));
    }
}

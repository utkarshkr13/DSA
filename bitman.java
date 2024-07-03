import java.util.*;
public class bitman {
    public static void oddoreven(int n){
        int bitmask = 1;
        if ((n & bitmask)==0){
            //even number
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

    }
    public static void main(String args[]){
        oddoreven(5);
        oddoreven(2);
        oddoreven(11);
    }
    
}

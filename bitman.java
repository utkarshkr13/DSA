import java.util.*;
public class bitman {
    public static void oddoreven(int n){
        int bitmask = 1;
        if ((n & bitmask)==0){
            //even number
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
        }

    }
    
    public static void main(String args[]){
        //Giving value to the function
        oddoreven(22);
        oddoreven(5);
        oddoreven(2);
        oddoreven(11);
    }
    
}

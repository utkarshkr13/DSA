import java.util.*;
public class func_q2 {
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();
        if(isEven(a)){
            System.out.println("The number is even");
        } 
        else{
            System.out.println("Number is odd");
        }

    }
    public static boolean isEven(int number){
        if (number%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    
}

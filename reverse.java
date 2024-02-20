import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number: ");
        int a = sc.nextInt();
        int b,c,d=0;
        
        if (a%10==0){
            a=a/10;
        }

        if (a<0){
            a=a*(-1);
            d=1;
        }
        while (a>0){
            c=a%10;
            a=a/10;
            if (d==1){
                System.err.print("-");
                System.err.print(c);
                d=0;
            }
            else{
                System.err.print(c);
            }
            
        }
        

    }
    
}

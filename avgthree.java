import java.util.Scanner;
public class avgthree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number: ");
        int j= sc.nextInt(); 
        int k =0;
        int h = 0;
        for(int i=0;i<j;i++){
            System.out.println("Enter the Number: ");
            int m = sc.nextInt();
            h=m+h;
        }
        System.err.println("The Average is "+(h/j));
    }
    
}

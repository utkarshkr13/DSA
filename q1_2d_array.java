import java.util.*;
public class q1_2d_array{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int araay[][] = {{4,7,8},{8,8,7}};
        int count=0;
        System.out.print("Enter the number to search ");
        int a = sc.nextInt();
        for(int i=0;i<araay.length;i++){
            for (int j=0;j<araay[0].length;j++){
                if (araay[i][j]==a){
                    count++;
                }
            }

        }
        System.out.println("The Count of digit "+a+" is "+count);



    }
}
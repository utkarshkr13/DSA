import java.util.*;
public class islow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");

        StringBuilder sb = new StringBuilder(sc.next());
        int count=0;

        for (int i=0;i<sb.length();i++){
            char ab = sb.charAt(i);
            if(ab=='a'||ab=='e'||ab=='i'||ab=='o'||ab=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}

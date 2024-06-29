import java.util.*;
public class islow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");

        StringBuilder sb = new StringBuilder(sc.next());
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        int count=0;

        for (int i=0;i<sb.length();i++){
            char ab = sb.charAt(i);
            if(vowels.contains(ab)){
                count++;
            }
        }
        System.out.println(count);
    }
    
}

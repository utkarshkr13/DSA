import java.util.*;
public class anagrams {

    public static Boolean anag(String first, String second){
        char[] ch1 = first.toCharArray();
        char[] ch2 = second.toCharArray();
        Boolean result=false;

        if(ch1.length!=ch2.length){
            result= false;
            return result;
        }
        else{
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            for(int i=0; i<ch1.length;i++){
                if (ch1[i]==ch2[i]){
                    result=true;
                }
                else{
                    result=false;
                    break;
                }
            }
        }
        return result;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String : ");
        String a = sc.next();

        System.out.println("Enter Second String : ");
        String b = sc.next();

        System.out.print("The Strings "+a+" & "+b+" Are Anagram: ");
        System.out.println(anag(a, b));


    }
    
}

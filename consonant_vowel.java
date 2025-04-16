import java.util.Scanner;

public class consonant_vowel {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter your character: ");

            char c = in.next().charAt(0);
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                System.out.println("vowel");
                default:
                System.out.println("consonant");
                break;

        
                
            }


        

    }
    
}

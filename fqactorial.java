import java.util.Scanner;

public class fqactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int fact = 1;
    

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
    
}

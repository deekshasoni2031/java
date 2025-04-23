import java.util.Scanner;
public class strong_number {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=sc.nextInt();
        int originaln=n;
        int sum=0;
        
        while(n>0){
            int digit = n%10;
             int fact = 1;
            for(int i=1;i<=digit;i++){
                fact *= i;
            }
            sum +=fact;
            n /= 10;
        }
       if(sum==originaln){
        System.out.println(originaln+"is a strong number");
       } 
       else{
        System.out.println(originaln+"is not a strong number");
       }
    }
    
}

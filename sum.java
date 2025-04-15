import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter n");
        int n= in.nextInt();
        int i=1;
        int sum=0;
        while (i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);


    }
    
}

import java.util.Scanner;
public class asum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = in.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the value of array: ");
        //int[] arr={1,2,3,4,5,6,7,8};
        
       // System.out.println(arr[0]);

        for(int i=0;i<n;i++){  //input size of array
            arr[i]=in.nextInt();
        }

        int sum=0;
        for(int j=0;j<n;j++){  //sum
            sum=sum+arr[j];
            

        }
        System.out.println("sum is:"+sum);


        
    }
    
}

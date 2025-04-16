
import java.util.Scanner;

public class amax {
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

        int max=0;
        for(int j=0;j<n;j++){
            if (arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("max element : ");
        System.out.println(max);

        
    }
}
    
    
    
    


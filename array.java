
import java.util.Scanner;
public class array {
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

        for(int k=0;k<arr.length;k++){     //elements of array
            System.out.println(arr[k]);
        }

        for(int j=arr.length-1;j>=0;j--){   //reverse
            System.out.println(arr[j]);
        }

        System.out.println("array is:/n");        
    }
    
}

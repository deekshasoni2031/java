public class sum2 {
    public static void main(String[] args) {
        int a=2005;
        
        int res=0;
        int sum=0;
        while(a>0){
            int digit=a%10;  //3 
            a=a/10;  //123/10=12
            sum=sum+digit;  //0=0+3
        }
        System.out.println("sum is:"+sum);

        
    }
    
}

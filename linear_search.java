public class linear_search {
    public static int Linear_Search(int[] arr){
        int target=100;
        int i;
        for( i=0;i<arr.length;i++){
            if(arr[i]==target){
                return 1;     // OR Sout(i) 
            }
            else{
                return -2;
                }
        }
        return i;
    
    }
    public static void main(String[] args) {
        int[] arr={1,4,7,3,45};
        System.out.println(Linear_Search(arr));
    }
}

public class function4 {
    //smallest element in an array
    static int small(){
      int[]  arr={11,33,56,23};
      int small=arr[0];
      for(int i=0;i<arr.length;i++){
          if(small>arr[i]){
            small=arr[i];
          }
      }
    return small;

    }
    public static void main(String[] args) {
        System.out.println(small());
    }
    
}

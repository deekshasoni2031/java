public class loops {
    public static void main(String[] args) {
        //for loop
        System.out.println("for loop: ");
        for(int i=1;i<=5;i++){
            System.out.println("i= "+i);
        }

        //while loop
        System.out.println("\n while loop");
        int j=1;
        while(j<=5){
            System.out.println("j= "+j);
            j++ ;
        }

        //do-while
        System.out.println("do-while: ");
        int k=1 ;
        do { 
            System.out.println("k= "+k);
            k++;
        } while (k<=5);
    }
}

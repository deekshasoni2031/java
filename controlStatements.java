public class controlStatements {
    public static void main(String[] args) {
        int number = 10 ;

        //if statement
        if(number>0){
            System.out.println("the no. is positive");
        }

        //if-else statement
        if(number%2==0){
            System.out.println("the no. is even");
        }
        else{
            System.out.println("no. is odd");
        }

        //if-else-if statement
        if(number<0){
            System.out.println("the no. is -ve");
        }else if (number == 0) {
            System.out.println("the no. is 0");
        }else{
            System.out.println("the no. is +ve");
        }

        //switch statement
        int day=3;
        switch (day) {
            case 1 :
            System.out.println("monday");

            case 2 :
                System.out.println("tuesday");

                case 3 :
                    System.out.println("wednesday");
                    break ; 

                    default :
                    System.out.println("other day");
        }
    }
    
}

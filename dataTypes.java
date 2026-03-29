

public class dataTypes {
    public static void main(String args[]){

        //-----primitive data types--------
        byte b = 100 ;  //1 byte
        short sh = 30000 ;  //2 byte
        int i = 100000 ;   //4 byte
        long l = 10000000 ;   //8 byte
        float f = 3.14f ; // 4 byte
        double d = 3.14159265359 ; //8 byte
        char c = 'A' ; //2 byte 
        Boolean  Flag = true ; //1 bit

        //------non-primitive
        String str = "hello" ;
        int[] arr = {1,2,3,4,5} ;
        Integer wrraperInt = Integer.valueOf(50);
        StringBuilder sb = new StringBuilder("java");

       System.out.println("byte: "+ b);
       System.out.println("short: "+sh);
       System.out.println("integer: "+i);
       System.out.println("long: "+l);
       System.out.println("boolean: "+Flag);
       System.out.println("wrapper Integer: "+ wrraperInt); 
       System.out.println("stringBuilder: "+sb);

    }

    
}

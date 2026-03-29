public class variables{
    //instance variable(belongs to each object)
    int instanceVariable = 10 ;

    //static variable(shared across all objects of the class)
     static String staticVar = "i am static" ;
     
     //local variable
     public void showVariables(){
        //local variable(declared inside a method)
        int localVar = 5 ;

        System.out.println("instance variable: "+instanceVariable );
        System.out.println("static variable: "+staticVar);
        System.out.println("local variable: "+localVar);


     }
     public static void main(String[] args) {
         //creating object
         variables obj1 = new variables();
         obj1.showVariables();

         //accessing static variable directly using class name
         System.out.println("accessing static variable via class: "+variables.staticVar);
     }
}

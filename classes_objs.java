public class classes_objs {
    public static void main(String[] args) {
        student obj= new student();
        obj.fullName();
        
    }
    
}
class student{
    String firstName="rahul";
    String lastName="jain";
    void fullName(){
        System.out.println(firstName + "     " +lastName);
    }

  


}
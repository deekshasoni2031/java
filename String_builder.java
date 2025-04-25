public class String_builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append("hiii");
        System.out.println(str);


        StringBuilder str1 = new StringBuilder(15);
        str1.append("hello hii byee");
        System.out.println(str1.length());
        System.out.println(str1.capacity());

    }
    
}

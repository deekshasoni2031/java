import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class list_of_name {
    public static void main(String[] args) {
        List<String> name=Arrays.asList("ram","shyam","om","sita");
        List<String> filterName= name.stream()
                                     .filter(n-> n.length()>3)
                                     .collect(Collectors.toList());
        System.out.println("names with more than 3 char.:"+filterName);
        List<String> uppercase=filterName.stream()
                                         .map(n->n.toUpperCase())
                                         .collect(Collectors.toList());
                                         System.out.println("uppercase:"+uppercase);
    }
    
}

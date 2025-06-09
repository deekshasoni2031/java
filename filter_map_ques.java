import java.util.*;
import java.util.stream.*;

//import javax.sound.sampled.SourceDataLine;
public class filter_map_ques {
    public static void main(String[] args) {
        List <Integer> list= Arrays.asList(1,2,3,4,5);
        List <Integer> evenlist= list.stream()
                                     .filter(n->n%2==0)
                                     .collect(Collectors.toList());
        System.out.println("even numbers are"+ evenlist);
        List<Integer> squareOfEven = evenlist.stream()
                                             .map(n->n*n)
                                             .collect(Collectors.toList());
                System.out.println("square of even numbers are"+squareOfEven);
    }
    
}

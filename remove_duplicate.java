import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class remove_duplicate {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(999,1000,1500,1000,2000);
         List<Integer> newList= list.stream()
                                    .distinct()
                                    .collect(Collectors.toList());
                                    System.out.println("new list"+ newList);
        List<Integer> morethan1000=newList.stream()
                                          .filter(n-> n>1000)
                                          .collect(Collectors.toList());
                        System.out.println("pricr greater than 1000:"+morethan1000);
         int totalSum= morethan1000.stream().reduce(0,(a,b)->a+b);
           System.out.println("total sum is:"+totalSum);

    }
}

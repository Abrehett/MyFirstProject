import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {
        List<Integer> myList= Arrays.asList(1,2,3,4,3,5,9,2,2,6);
       // myList.forEach(x-> System.out.println(x));
       // myList.forEach(System.out::println);

        //Filter
        System.out.println("Filter");
        myList.stream()
                .filter(i->i%3==0)
                .distinct()  // this removes the dublicate
                .forEach(System.out::println);

        //Limit
        System.out.println("Limit");
        myList.stream().
                filter(i->i%2==0).
                limit(1).
                forEach(System.out::println);

        //Skip
        System.out.println("Skip");
        myList.stream()
                .filter(i->i%2==0)
                .skip(2)
                .forEach(System.out::println);

        //Map
        System.out.println("Map");
        myList.stream()
                .map(number->number*2)
                .filter(i->i%3==0)
                .forEach(System.out::println);


    }
}

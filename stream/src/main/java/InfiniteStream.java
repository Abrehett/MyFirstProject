import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        Stream.iterate(0,n->n+2)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("****************************");

            // how does it work ? iterate needs a lambda to specify the successor element.
            // In the case of the tuple (3,5) teh successor (5,3+5) =(5,8)
            // The next one (8, 5+8)

                            // "******** Fibonacci  in  two digits ()********"

        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(8)
               // .forEach(System.out::println);  this doesn't work it gives us array so we have to solve it the following way:-
                .forEach(t-> System.out.println("(" + t[0]+ "," + t[1] + ")"));


        // "******** Fibonacci  ********"
        System.out.println("\"******** Fibonacci  ********");
        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]})
                .limit(8)
                .map(t->t[0])
                .forEach(System.out::println);
        // .forEach(System.out::print);


    }
}

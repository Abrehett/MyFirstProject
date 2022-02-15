import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {
        //Find all transactions in 2011 in 2011 and sort by value
        System.out.println("*********************** Task-1 *********************");
        TransactionData.getAll().stream()
                .filter((x -> x.getYear() == 2011))
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //what are all the unique cities where the trader work?
        System.out.println("*********************** Task-2 *********************");

            TransactionData.getAll().stream()
                    .map(((x->x.getTrader().getCity())))
                    .distinct()
                    .forEach(System.out::println);

        //Find all traders from Cambridge adn sort them by name
        System.out.println("********************** Task-3 *********************");

        TransactionData.getAll().stream().map(Transaction::getTrader)
                .filter((x -> x.getCity() == "Cambride")).distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //Return a string of all trader's names sorted alphabetically
        System.out.println("*********************** Task-4 *********************");
        String result= TransactionData.getAll().stream().map(x->x.getTrader().getName())
                .distinct().
                sorted()
                .reduce(" ",(name1,name2)->name1+name2+"  ");
        System.out.println(result);

        //Are any trader base in millan
        System.out.println("*********************** Task-5 *********************");
        boolean milanBase=TransactionData.getAll().stream().anyMatch(x->x.getTrader().getCity().equals("Milan"));
        System.out.println(milanBase);

        //Print the values of all transactions from the traders living in cambride
        System.out.println("*********************** Task-6 *********************");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambride")).
                map(Transaction::getValue).forEach(System.out::println);


        //What is the highest value of all the trasaction
        System.out.println("*********************** Task-7 *********************");
        Optional<Integer> high= TransactionData.getAll().stream().
                map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(high.get());

        //8.Find  the transaction with the smallest value
        System.out.println("*********************** Task-8 *********************");

        Optional<Transaction>smvalue=TransactionData.getAll().stream()
                .reduce((t1,t2)->t1.getValue()<t2.getValue()?t1:t2);
                System.out.println(smvalue.get());

                // different method
                Optional<Transaction> smallestValue=TransactionData.getAll().stream()
                        .min(comparing(Transaction::getValue));
                    System.out.println(smallestValue.get());

    }
}

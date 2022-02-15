import java.util.Arrays;
import java.util.List;

public class TaskCharacter {
    public static void main(String[] args) {


        //Task
        //Given a list of words,print the number of charters for each word
        List<String> words = Arrays.asList("JAVA", "APPLE", "HONDA", "DEVELOPER");

        String x="Java";
        System.out.println(x.length());

        words.stream()
                .map(l -> l.length())// or i can do .map(String::length)
                .forEach(System.out::println);

        System.out.println("To get the first letter the following");
        words.stream().map(k -> k.charAt(0)).forEach(System.out::println);
        // words.stream().map(each->each.length()).forEach(System.out::println);
    }
}
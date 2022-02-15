import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args){

        //Crating stream from Array

            String[] courses ={"java", "JS","TS"};
             Stream<String> courseStream =Arrays.stream(courses);
             //Creating Stream from collection
             List<String> courseList= Arrays.asList("Java","DS","SPRING");
             Stream<String> courseStream2=courseList.stream();
             List<Course>myCourse = Arrays.asList(
             new Course("JAVA", 100),
             new Course("DS", 101),
             new Course("SPRING", 102),
             new Course("Microservices", 103)         );
             Stream<Course>mycourseStream = myCourse.stream();
            // creating Stream from values
             Stream<Integer>stream=Stream.of(1,2,3,4);
    }

}

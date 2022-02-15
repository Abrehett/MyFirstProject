import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(3,4,5,6,6,70);

        //toCollection(Supplier) : is used to create a collections using collectors
        System.out.println("***********ToCollection()****************");
        List<Integer> numberList=numbers.stream()
                .filter(x->x%2==0).
                collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer>numberSet=numbers.stream()
                .filter(x->x%2==0).
                collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //toList():returns a collector interfacet hat gathers the input data into a new list
        System.out.println("***********************TOLIST*******************8");

        List<Integer>numbetList2=numbers.stream()
                .filter(x->x%2==0).
                collect(Collectors.toList());
        System.out.println(numbetList2);


        //toSet():return a collector interface that gathers the input data into a new set
        Set<Integer>numberSet2=numbers.stream()
                .filter(x->x%2==0).
                collect(Collectors.toSet());
        System.out.println(numberSet2);

        //toMap(Function,Functions):return a Collector interface that gathers the input data into a new map
        Map<String,Integer>dishMap=DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        //Counting(): returns a Collector that counts the number of the elements

        Long evenCount=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

        //SumingInt(ToIntFunction):returns a Collector that produces the sum of an integer-valued fun
        //Counting(): returns a Collector that counts the number of the elements

        Integer sum=DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);

        //averagingInt(ToIntFunction): returns tha average of the integers passed values
        Double calorieAvg=DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAvg);

        //joining():is used to join various elemets of a character of string array ito a single string object
        System.out.println("**********************Joining***************************************");
        List<String>courses=Arrays.asList("Java","JS","TS");
        String str=courses.stream().collect(Collectors.joining(","));
        System.out.println(str);

        //partitioningBy(): is used to partition a stream of objects(or set of elements based on a given predicate
        System.out.println("*********************PartitioningBy)*******************");
        Map<Boolean,List<Dish>> VeggieDish=DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(VeggieDish);

        //groupingBy(): is used for grouping objects by some property and storing results in a map instance
        System.out.println("*********************groupingBy)*******************");

        Map<Type,List<Dish>> dishType=DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);
    }
}

import java.util.Comparator;

public class DishTask {
    public static void main(String[] args) {

        //print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);


        //DishData.getAll().stream().map(Dish::getName).forEach(System.out::println);
        System.out.println("The high calorie dishes are :-------");
    DishData.getAll().stream().filter(dish->dish.getCalories()>300).map(Dish::getName).forEach(System.out::println);

        // print the length of the name of each dish
        System.out.println("**************************");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //print three high calorie Dish name(>300)
        System.out.println("**************************");
        DishData.getAll()
                .stream()
                .filter(dish->dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        //print all dish name that are below 400 calories in stored
        System.out.println("**************************");
        DishData.getAll()
                .stream()
                .filter(dish ->dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);



        //print all dish name that are below 400 calories in stored ==> reverse it
        System.out.println("**************************");
        DishData.getAll()
                .stream()
                .filter(dish ->dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);
    }
}

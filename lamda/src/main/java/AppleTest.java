import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.Green));
        inventory.add(new Apple(100, Color.Red));
        inventory.add(new Apple(200, Color.Green));
        inventory.add(new Apple(50, Color.Red));

//        List<Apple> heavyApply = filterApples(inventory, new AppleHeavyPredicate());
//        System.out.println(heavyApply);
//
//        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
//        System.out.println(greanApple);
//
//    }
//
//    private static List<Apple> filterApples(List<Apple>inventory,ApplePredicate applePredicate){
//
//        List<Apple> result = new ArrayList<>();
//
//        for(Apple apple : inventory){
//            if(applePredicate.test(apple)){
//                result.add(apple);
//            }
//        }
//        return result;
//    }
//}




    List<Apple> greenApple =filterApples(inventory,apple->apple.getColor().equals(Color.Green));
        System.out.println(greenApple);


}
    private static List<Apple> filterApples(List<Apple>inventory, Predicate<Apple> applePredicate){

        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }}
import java.util.*;
import java.util.function.Predicate;

public class predicateFunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number->{
             //one
            if (number%2==0)
            return true;
            return false;

            // two
            //if we hava to use ternary we have to replace the if with ? 1 and 2 are the same just use different methods
                //(number %2==0)?true:false;
        };
        boolean r1=isEven.test(10002);
        System.out.println(r1);
        System.out.println("_________________________________________________");

        List<String>list= new ArrayList<>();
        list.addAll(Arrays.asList("Java","C#","C#","C++","Pyton"));

        Predicate<String >isUnique= p-> Collections.frequency(list,p)==1;
        boolean r2=isUnique.test("C#");
       // boolean r2=isUnique.test("C++");
        System.out.println(r2);

// isUnique is tha abstract method and inorder to get all the unique elements from the list i can write the following code

        for(String s:list){
            if(isUnique.test(s)){
                System.out.println(s);

                System.out.println("--------------------------------------------------------");

                List<Integer>nums=new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,30,30,40,40,50,60,70,80));
            // 11. the below metod doesn't remove the numbers that are less than 40
                for(int i=0;i<nums.size();i++){
                    if(nums.get(i)<40){
                        nums.remove(i);
                    }
                }
                System.out.println(nums);
                System.out.println("_________________________________________________");
                //11.2 this methods removes the numbers less <40
                List<Integer>nums2=new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,30,30,40,40,50,60,70,80));
                Iterator<Integer>iterator=nums2.iterator();
                while (iterator.hasNext()){
                    if(iterator.next()<40){
                        iterator.remove();
                    }
                }
                System.out.println("This is using the iterator  "+nums2);
                System.out.println("--------------------------------------------------------------");

                // but we have removeIf()method in functional interface
                List<Integer>nums3=new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,30,30,40,40,50,60,70,80));

                //1st and long
//                Predicate<Integer> lessThan40 = p->{
//                    if(p<40)
//                        return true;
//                    return false;
//                };

                //short method
                Predicate<Integer> lessThan40 = p->p<40;
                nums3.removeIf((lessThan40));
                System.out.println("This is the predicate and short method "+nums3);
}

        }
        }
    }


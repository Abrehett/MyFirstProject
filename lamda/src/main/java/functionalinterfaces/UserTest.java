package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class UserTest  {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("Mike").lastName("Smith").age(35).build());
        users.add(User.builder().firstName("Tom").lastName("Hanks").age(25).build());
        users.add(User.builder().firstName("Ammy").lastName("Evan").age(38).build());
        users.add(User.builder().firstName("Emma").lastName("Pellard").age(40).build());

        //Print all elements in the list

        printName(users, p -> true);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

        // Print all users that last name starts with E
        printName(users, user -> user.getLastName().startsWith("E"));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

         printName(users,bx->bx.getAge()>30);

   }
        private static void printName(List<User> users,Predicate<User> p){
            for(User user: users){
                if (p.test(user)) {
                    System.out.println(user.toString());

                }
            }
        }
    }


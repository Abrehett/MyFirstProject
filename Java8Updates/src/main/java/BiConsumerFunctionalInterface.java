import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {
    public static void main(String[] args) {
        BiConsumer<String,Integer> printMultipleTimes=(x,y)->{
            for (int i =0;i<y;i++){
                System.out.print(x);
            }
            System.out.println();
        };
        printMultipleTimes.accept("Cybertek",5);
        System.out.println("-----------------------");

        // employeeName and hireDate
        Map<String, LocalDate>map=new LinkedHashMap<>();
        map.put("John",LocalDate.of(2020,10,25));
        map.put("Jimmy",LocalDate.of(2019,10,25));
        map.put("Aron",LocalDate.of(2018,10,25));
        map.put("Shay",LocalDate.of(2017,10,25));

        //before
//        for(Map.Entry<String,LocalDate>each :map.entrySet()){
//            System.out.println(each.getKey()+":"+each.getValue());

       // map.forEach((k,v)-> System.out.println(k+" : "+v)); // this prints all
        map.forEach((k,v)-> {
            if(v.getYear()<2019){
                System.out.println(k);
            }
        });






























        }
    }


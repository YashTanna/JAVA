import java.util.*;
import java.util.stream.*;

public class StreamApi3 {

    public static void main(String[] args) {

//        -- Object Stream

//        Stream.of("Assam","Gujrat","Maharastra","Goa","Keral","Rajasthan","MathyaPradesh")
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("M"))
//                .sorted().forEach(System.out::println);

//----------------------------------------------------------------------------------------------------------------------

//        -- Premitive Stream

//        IntStream.range(1,6).map(m -> m*m).average().ifPresent(System.out::println);

//        Stream.of("101","100","102").mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

//----------------------------------------------------------------------------------------------------------------------

//        -- Premitive Stream to Object Stream

//        IntStream.range(101,106)
//                .mapToObj(t -> "" + t)
//                .forEach(System.out::println);

//----------------------------------------------------------------------------------------------------------------------

//        -- If Terminal Operation is missing then stream will not print

//        Stream.of("Gujrat","Goa","Tamilnadu").filter(s -> s.startsWith("G"));

//----------------------------------------------------------------------------------------------------------------------

//        Sequance of executuions

        Stream.of("Gujrat","Bihar","Goa","Tamilnadu").filter(s -> {
            System.out.println("inside filter() : "+s);
            return true;
        }).forEach(s ->{
            System.out.println("Inside forEach() : "+s);
        });

    }

}

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class StreamApi {

    public static void main(String[] args) {
        List<String> l = Arrays.asList(
                "Assam",
                "Bihar",
                "Gujrat",
                "Goa",
                "Himachal Pradesh",
                "Maharastra",
                "Utter Pradesh"
        );

//        Method 1

//        l.stream().filter(s -> s.startsWith("G")).map(String::toUpperCase).sorted().forEach(System.out::println);

        Stream<String> s = l.stream();

//        How to define Predicate
        Predicate<String> p = new Predicate(){
            @Override
            public boolean test(Object o) {
                if(o.toString().startsWith("G")){
                    return true;
                }else{
                    return false;
                }
            }
        };

//        Second Method

//        Stream<String> sf = s.filter(p);
////       Stream<String> sf = s.filter(s -> s.startWith("G"));
//        Stream<String> sfm = sf.map(String::toUpperCase);
//        Stream<String> sfms = sfm.sorted();
//        sfms.forEach(System.out::println);
//
//        Third Method

        Arrays.asList("Assam",
                "Bihar",
                "Gujrat",
                "Goa",
                "Himachal Pradesh",
                "Maharastra",
                "Utter Pradesh").stream().filter(a -> a.startsWith("G")).map(String::toUpperCase).sorted().forEach(System.out::println);

    }

}

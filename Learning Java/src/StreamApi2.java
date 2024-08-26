import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class StreamApi2 {

    public static void main(String[] args) {

        List<Integer>l = Arrays.asList(10,21,30,43,50,67,72,89,99,100);

        Stream<Integer>s = l.stream();

        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {

                if(integer%2 == 0)
                    return true;
                return false;
            }
        };

//        int sum = 0;

        int sum  = s.filter(p).mapToInt(Integer::intValue).sum();


        System.out.println(sum);

    }

}

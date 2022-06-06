package stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExapmle {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "c", "b", "d");


        //Iterator 사용
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String alp = iterator.next();
            System.out.println(alp);
        }

        //String 사용
        Stream<String> stream = list.stream();
        stream.forEach(name -> System.out.println(name));
    }
}

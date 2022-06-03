package CollectionFramework.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        System.out.println("---------------------");

        vector.add("a");
        vector.add("b");

        System.out.println(vector.add("c"));
        System.out.println(vector.add("d"));
        System.out.println(vector.add("e"));

        System.out.println("====================");
        System.out.println(vector.size());

        for (String s : vector) {
            System.out.println(s);
        }

        System.out.println(vector);

        for (String s : vector) {
            System.out.println();
        }
    }
}

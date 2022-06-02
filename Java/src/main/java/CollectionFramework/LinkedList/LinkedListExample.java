package CollectionFramework.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("c");
        linkedList.add("b");
        linkedList.add("d");
        linkedList.add("e");

        for (String value : linkedList) {
            System.out.println(value);
        }

        System.out.println("-----------------------------");

        linkedList.remove(3);

        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println("-----------------------------");

        Collections.sort(linkedList);
        for(String s : linkedList) {
            System.out.println(s);
        }
    }
}

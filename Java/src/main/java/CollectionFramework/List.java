package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(210);
        arrayList.add(230);
        //asdf
        for(Integer integer : arrayList) {
            System.out.println(integer);
        }
        System.out.println("-------------------------");
        arrayList.remove(3);

        for(Integer integer : arrayList) {
            System.out.println(integer);
        }
        System.out.println("-------------------------");
        Collections.sort(arrayList);

        for(Integer integer : arrayList) {
            System.out.println(integer);
        }
        System.out.println("-------------------------");
        arrayList.set(1, 100);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------");
        System.out.println(arrayList.size());
    }
}

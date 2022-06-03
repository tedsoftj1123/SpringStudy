package CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet= new HashSet<>();
        hashSet.add("a"); //add data in hashSet
        hashSet.add("java");
        hashSet.add("ted");
        hashSet.add("1123");

        System.out.println(hashSet.add("samedata")); //true
        System.out.println(hashSet.add("samedata")); //false

        for(String input : hashSet){
            System.out.println(input);
        }

        System.out.println("hashset Size : " + hashSet.size());
    }
}

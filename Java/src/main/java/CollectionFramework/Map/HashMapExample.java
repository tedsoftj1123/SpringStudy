package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("asdf", 12);
        map.put("sdf", 43);
        map.put("egd", 23);
        map.put("asdf", 74);
        System.out.println("Entry " + map.size());

        System.out.println("\tasdff : " + map.get("asdf"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + " : " + value);
        }
        System.out.println();

        map.remove("asdf");
        System.out.println("entity :" + map.size());
    }
}

import java.util.*;

public class h4 {
    public static void main(String[] args) {
        // You can replace with HashMap / LinkedHashMap / TreeMap
        Map<Integer, String> map = new HashMap<>();
        // Map<Integer, String> map = new LinkedHashMap<>();
        // Map<Integer, String> map = new TreeMap<>();

        // 1. put() - Add key-value pairs
        map.put(101, "Apple");
        map.put(102, "Banana");
        map.put(103, "Mango");
        map.put(102, "Orange"); // duplicate key -> value updated

        System.out.println("Map after put: " + map);

        // 2. get() - Retrieve value
        System.out.println("Value for key 101: " + map.get(101));

        // 3. containsKey() / containsValue()
        System.out.println("Contains key 103? " + map.containsKey(103));
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));

        // 4. remove() - Remove entry
        map.remove(103);
        System.out.println("After removing key 103: " + map);

        // 5. size() / isEmpty()
        System.out.println("Size of map: " + map.size());
        System.out.println("Is map empty? " + map.isEmpty());

        // 6. Iterating over keys
        System.out.println("Iterating keys:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // 7. Iterating over values
        System.out.println("Iterating values:");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        // 8. Iterating over key-value pairs (entrySet)
        System.out.println("Iterating key-value pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 9. putAll() - Copy another map
        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(104, "Grapes");
        newMap.put(105, "Pineapple");
        map.putAll(newMap);
        System.out.println("After putAll: " + map);

        // 10. clear() - Remove all entries
        map.clear();
        System.out.println("After clear(): " + map);
    }
}

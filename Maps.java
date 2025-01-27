import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        map.put(100, 10);
        map.put(50, 5);
        System.out.println("Map Values: " + map);
        System.out.println(map.get(100));

        // Iterating using for-each loop
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Size of map
        System.out.println("Size of map: " + map.size());

        System.out.println(map.get(4));

        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue(5));
        System.out.println(map.isEmpty());
        map.remove(0);

        System.out.println("After removing: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Removing non-existing key-value pair
        map.remove(99); // No error
        System.out.println(map.remove(55)); // returns null

        
    }
}

import java.util.*;

class HashMapExample1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Manglore");
        map.put(24, "Banglore");
        map.put(39, "Udupi");
        map.put(4, "Manipal");
        map.put(null, null);

        System.out.println(map);
        System.out.println("All Keys: " + map.keySet());
        System.out.println("All values: " + map.values());

        System.out.println("Iterating Hashmap: ");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        // map.put(1, "Calicut");
        // map.remove(3);
        System.out.println(map);

        System.out.println(map.containsKey(4));
    }
}

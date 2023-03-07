import java.util.*;

class TreeMapExample1 {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(4, "Manipal");
        map.put(1, "Manglore");
        map.put(3, "Udupi");
        map.put(2, "Banglore");
        //map.put(null, null);

        System.out.println(map);
        System.out.println("All Keys: " + map.keySet());
        System.out.println("All values: " + map.values());

        System.out.println("Iterating Hashmap: ");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println(map);
        System.out.println("descendingMap: "+map.descendingMap());  

    }
}

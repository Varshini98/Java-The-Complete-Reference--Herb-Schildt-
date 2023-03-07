import java.util.*;

enum Months {
    January, February, March, April, May, June, July, August, September, October;
}

public class EnumMapExample {

    public static void main(String[] args) {

        EnumMap<Months, String> map = new EnumMap<Months, String>(Months.class);
        map.put(Months.January, "1");
        map.put(Months.February, "2");
        map.put(Months.April, "3");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
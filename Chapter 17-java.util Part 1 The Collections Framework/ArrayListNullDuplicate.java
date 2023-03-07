import java.util.ArrayList;

class ArrayListNullDuplicate {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add(null);
        list1.add(null);

        System.out.println(list1);
        System.out.println(list1.size());

        list1.add("dupue");
        list1.add("dupue");

        System.out.println(list1);
        System.out.println(list1.size());

    }
}
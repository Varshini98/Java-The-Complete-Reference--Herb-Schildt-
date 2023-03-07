import java.util.ArrayList;

class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(111);
        list1.add(222);
        list1.add(333);
        list1.add(444);

        System.out.println(list1);

        list1.remove(3);
        System.out.println(list1);

        list1.remove(Integer.valueOf(111));
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("11");
        list2.add("22");
        list2.add("33");
        list2.add("44");

        System.out.println(list2);

        list2.remove("44");
        System.out.println(list2);
    }

}

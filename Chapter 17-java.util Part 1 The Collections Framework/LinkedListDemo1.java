import java.util.*;

class LinkedListDemo1 {
    public static void main(String[] args) {
        // ArrayList<String> l0 = new ArrayList<String>();
        // l0.add("F");
        // l0.add("B");
        // l0.add("D");
        // l0.add("E");
        // l0.add("C");
        // System.out.println(l0);

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");

        System.out.println(ll);

        ll.addFirst("V");
        ll.addLast("S");
        System.out.println(ll);

        LinkedList<String> l1 = new LinkedList<String>();
        // LinkedList<String> l3 = new LinkedList<String>();

        System.out.println(ll.getFirst());
        System.out.println(l1.peekFirst());

        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[20];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
        s.getChars(start+2, end+2, buf, 10);
        System.out.println(buf);

    }
}
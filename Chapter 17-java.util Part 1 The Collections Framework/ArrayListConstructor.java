import java.util.ArrayList;

import java.util.*; 

class ArrayListConstructor{
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        System.out.println(list1.size());
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(11);
        list2.add(11);
        list2.add(11);
        list2.add(11);
        System.out.println(list2.size());
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<Integer>(list2);
        list3.add(22);
        list3.add(22);
        list3.add(33);
        list3.add(5511);
        System.out.println(list3.size());
        System.out.println(list3);
        
        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        list4.add(3);
        list4.add(242);
        list4.add(363);
        list4.add(55711);
        System.out.println(list4.size());
        System.out.println(list4);


        for (Integer integer : list4) {
            System.out.println(integer);
        }

        Iterator<Integer> itr=list2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
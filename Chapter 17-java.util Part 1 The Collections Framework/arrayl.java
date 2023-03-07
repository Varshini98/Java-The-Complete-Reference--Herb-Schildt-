import java.util.ArrayList;
import java.util.Iterator;

class arrayl {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(4);

        b.add(11);
        b.add(22);
        b.add(33);
        a.addAll(b);


        Iterator<Integer> iter = a.iterator();
        while(iter.hasNext()){
            Integer c = iter.next();
            System.out.println(c);
        }

    //    System.out.println(a);
       
    //     for(int c:a){
    //         System.out.println(c);
    //     }

    // System.out.println(a.contains(34));

    // if(a.contains(4)){
    //     System.out.println(a.indexOf(4));
    // }
         
    



        // for(int i=0;i<a.size();i++){
        // System.out.print(" "+a.get(i));
        // }

        // System.out.println();
        // ArrayList<String> c= new ArrayList<String>();
        // c.add("a");
        // c.add("b");
        // c.add("c");
        // c.add("d");

        // System.out.println(c);
        // Iterator i = c.iterator();
        // while (i.hasNext()) {
        //     System.out.println(i.next());
        // }


        // int arr[]= {1,2,3,4};
        
        // for(int k=0;k<arr.length;k++){
        //     System.out.println(arr[k]);
        // }
        
        // for(int q : arr){
        //     System.out.println(q);
      //  }
    }
}
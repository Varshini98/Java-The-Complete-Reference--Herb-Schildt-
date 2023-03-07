import java.util.*;  

class HashMapDemo1{
    public static void main(String[] args) {
        HashMap<Integer,String> maplist = new HashMap<Integer,String>();
        maplist.put(11, "Varshini");
        maplist.put(12, "Neema");
        maplist.put(13, "Janmitha");
        maplist.put(14, "Ten");

        
        System.out.println(maplist.isEmpty());
        System.out.println(maplist.keySet());
        System.out.println(maplist.values());

        System.out.println(maplist.get(11));

        for(Map.Entry m:maplist.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
           }  
        

        
    }
}
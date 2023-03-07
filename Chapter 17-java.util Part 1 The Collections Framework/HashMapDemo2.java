import java.util.*;

class Customer {
    String Name;
    String Number;

    Customer(String Name, String Number) {
        this.Name = Name;
        this.Number = Number;
    }

    String getName() {
        return Name;
    }

    String getNumber() {
        return Number;
    }

    void show() {
        System.out.println("Hello" + Name);
    }

    void setName(String Name){
        this.Name=Name;
    }

    public String toString() {// overriding the toString() method
        return Name + " " + Number;
    }
}

class CustID {
    String custid;

    CustID(String custid) {
        this.custid = custid;
    }

    String getcustid() {
        return custid;
    }

    public String toString() {// overriding the toString() method
        return custid;
    }
}

class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<CustID, Customer> maplist = new HashMap<CustID, Customer>();
        CustID c = new CustID("null");
        Customer c0 = new Customer("Vrashini", "976543");
        maplist.put(c, c0);
        maplist.put(new CustID("123"), new Customer("Ten", "12345"));

        System.out.println(maplist.isEmpty());
        System.out.println(maplist.keySet());
        System.out.println(maplist.values());

        System.out.println(maplist.get(c).getName());
        maplist.get(c).show();

        maplist.get(c).setName("Saint");
        System.out.println(maplist.get(c));

        for(Map.Entry m:maplist.entrySet()){  
            System.out.println(m.getKey()+" "+m.getValue());  
           }  
           CustID c1 = new CustID("123");
System.out.println(maplist.containsKey(c1));
           

        //Customer a = maplist.get(c0);

       // System.out.println(a.getName());

    }
}

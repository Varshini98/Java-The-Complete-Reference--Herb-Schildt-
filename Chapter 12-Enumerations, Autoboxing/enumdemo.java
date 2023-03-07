enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class enumdemo {
    
    public static void main(String[] args) {
       // Apple all[] = Apple.values();
        for(Apple a: Apple.values()){
            System.out.println(a);
            System.out.println(a.ordinal());
        }

        System.out.println("Next: "); 

        Apple aa;
        aa = Apple.Jonathan;
        System.out.println(aa);

        System.out.println("Next: "); 
        
        Apple bb;
        bb = Apple.valueOf("RedDel");
        System.out.println(bb);


    }

}

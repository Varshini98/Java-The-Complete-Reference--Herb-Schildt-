class M {
    String a;

    public static void printOut() {
        System.out.println("M");
    }

    public void printAndSet() {
        a = "M";
        System.out.println(a);
    }

}

class Y extends M {
    public static void printOut() {
        System.out.println("Y");
    }
    public void printAndSet() {
         a = "Y";
         System.out.println(a);
    }
}

class Print {
    public static void main(String[] args) {
        M m = new M();
        Y y = new Y();
        
        M.printOut();
        Y.printOut();
        
        y.printAndSet();
    }
}
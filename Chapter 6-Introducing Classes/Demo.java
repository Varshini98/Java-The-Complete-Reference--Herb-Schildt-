class Outer {
    private int outer_x = 100;

    void display() {
        System.out.println("display: outer_x = " + outer_x);
    }

    int getx() {
        return outer_x;
    }
}

class Demo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        //System.out.println("display: outer_x = " + outer.getx());
        outer.display();
    }
}
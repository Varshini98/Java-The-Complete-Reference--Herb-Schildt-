class A1 {
    private int x;
    private int y;
    int z;

    A1() {
    }

    void setij(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void setx(int x) {
        this.x = x;
    }

    int gety() {
        return y;
    }

    int getx() {
        return x;
    }

    void show() {
        System.out.println("h " + getx());
        System.out.println("h " + gety());
        System.out.println("h " + z);
    }
}

class B1 extends A1 {
    void show() {
        // super.show();
        System.out.println(getx());
        System.out.println(gety());
        System.out.println(z);
    }
}

class Access {
    public static void main(String[] args) {
        // B1 b = new B1();
        // b.setij(1, 1, 1);
        // b.show();

        // b.setx(2);
        // System.out.println(b.getx());
        // b.show();

        A1 obj = new B1();
        obj.setij(0, 0, 0);
        obj.show();

        A1 obj3 = new A1();
        obj3.setij(0, 0, 0);
        obj3.show();


        A1 obj1 = new A1();
       
        B1 obj2 = new B1();

        A1 r;

        r = obj1;
        r.setij(1, 1, 1);
        r.show();
        
        r = obj2;
        r.setij(2, 2, 2);
        r.show();

    }
}

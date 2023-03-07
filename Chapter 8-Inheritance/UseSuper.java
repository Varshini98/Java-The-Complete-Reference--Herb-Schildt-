class A {
    int i;
    void show1() {
        System.out.println("i in superclass1: " + i);

    }
}


class B extends A {
    int i;

   B(int a, int b) {
        super.i=a;
        i=b;

    }

    void show() {
        System.out.println("i in subclass: " + i);

    }
}

class UseSuper {
    public static void main(String[] args) {
        B subOb1 = new B(1, 2);
        subOb1.show();
        subOb1.show1();
        
    }

}

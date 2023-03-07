class A {
    int x;

    A() {
        System.out.println("Inside A's constructor.");
    }

    A(int x) {
        this.x = x;
        System.out.println("Inside A's parameterised constructor: x :" + x);

    }

    void show() {
        System.out.println("A show Method: "+x);

    }

    void setx(int x) {
        this.x = x;
    }
}

class B extends A {
    B() {
        System.out.println("Inside B's constructor.");
    }

    B(int x) {
        super(x);
        this.x = x;
        System.out.println("Inside B's parameterised constructor: x :" + x);

    }

    void show() {
        //super.show();
        System.out.println("B show Method: "+x);

    }

}

class C extends B {
    C() {

        System.out.println("Inside C's constructor.");
    }

    C(int x) {
        super(x);
        this.x = x;
        System.out.println("Inside C's parameterised constructor: x :" + x);

    }

    void show() {
       // super.show();
        System.out.println("C show Method: "+x);

    }
}

class CallingCons {
    public static void main(String args[]) {
        // C c = new C();
       // C c1 = new C(2);
        //c1.setx(4);
        //c1.show();

         A a = new A();
         B b =new B();
         C c= new C();

         A r;
         r=a;
         r.show();

         r=b;
         r.show();
         
         r=c;
         r.show();
    }
}
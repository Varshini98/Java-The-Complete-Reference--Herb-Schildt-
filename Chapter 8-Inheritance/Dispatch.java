// Dynamic Method Dispatch
class A {
   private int x=2;

   int getx(){
   return x;
   }
    
    void show(){
        System.out.println(x);
    }
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B extends A {
    // override callme()
    void callme() {
        System.out.println("Inside B's callme method");
    }
    void show(){
        System.out.println(getx());
    }
}

class C extends A {
    // override callme()
    void callme() {
        System.out.println("Inside C's callme method");
    }
    void show(){
        System.out.println(getx());
    }
}

class Dispatch {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callme();
        a.callme();
        r.show();

        r = b;
        r.callme();
        b.callme();
        r.show();

        r = c;
        r.callme();
        c.callme();
        r.show();
    }
}
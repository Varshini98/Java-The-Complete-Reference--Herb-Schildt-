class AA {
    int x, y;
    static int z=1;

    AA() {
        x = 2;
        y = 2;
    }

    AA(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void add() {
        System.out.println(x + y);
    }

    public void sub() {
        System.out.println(x - y);
    }

    public static show(){
        System.out.println(z);
    }

}

class BB extends AA {

    BB() {

    }

    public void mul() {
        System.out.println(x * y);
    }

}

class Test {
    public static void main(String[] args) {

        BB b = new BB();
        b.x = 10;
        b.y = 1;
        b.add();
        b.sub();
        b.mul();

        AA a = b;
        a.add();
        a.sub();

        AA z = new BB();
        z.add();
        z.sub();

        System.out.println("Static: " + AA.z);
        System.out.println("Static: " + b.z);
        System.out.println("Static: " + BB.z);

    }

}

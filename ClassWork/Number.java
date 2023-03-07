class Number1 {
    int x, y;

    public Number1() {

    }

    public Number1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void compareNumber() {
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (x < y) {
            System.out.println(y + " is greater than " + x);
        } else {
            System.out.println(x + " and " + y + " are equal");
        }
    }
}

class Number2 {
    public Number2() {

    }

    boolean objEquals(Number1 b, Number1 a) {
        if (a.x == b.x && a.y == b.y) {
            return true;
        } else
            return false;
    }

}

class Number3 {
    public Number3() {

    }

    void findSum(Number1 obj) {
        int sum = 0;
        sum = obj.x + obj.y;
        System.out.println(obj.x + " + " + obj.y + " = " + sum);
    }

}

class Number {
    public static void main(String[] args) {
        Number1 obj1 = new Number1(2, 4);
        Number1 obj2 = new Number1(2, 4);
        Number1 obj3 = new Number1(5, 8);
        obj1.compareNumber();

        Number2 eql = new Number2();

        System.out.println("obj1 == obj2: " + eql.objEquals(obj1, obj2));
        System.out.println("obj3 == obj2: " + eql.objEquals(obj2, obj3));

        // array of Number object
        Number3 array[] = new Number3[3];

        for (int i = 0; i < 3; i++) {
            array[i] = new Number3();
        }

        array[0].findSum(obj1);
        array[1].findSum(obj2);
        array[2].findSum(obj3);

    }
}
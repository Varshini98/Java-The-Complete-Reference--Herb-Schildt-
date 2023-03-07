class Numberco {
    int x, y;

    public Numberco() {
    }

    public Numberco(int x, int y) {
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

    void findSum() {
        int sum = 0;
        sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);
    }

    public void objEq1(Numberco obj){
        while(obj.x>x){
            System.out.println("x : " + obj.x + " is greater than " + x);
            if (obj.y > y) {
                System.out.println("y : " +obj.y + " is greater than " + y);
            } else if (obj.y < y) {
                System.out.println("y : " +y + " is greater than " + obj.y);
            } else {
                System.out.println("y : " +y + " and " + obj.y + " are equal");
            } 
            break;
        }
        while(obj.x<x){
            System.out.println("x : " + x + " is greater than " + obj.x);
            if (obj.y > y) {
                System.out.println("y : " +obj.y + " is greater than " + y);
            } else if (obj.y < y) {
                System.out.println("y : " +y + " is greater than " + obj.y);
            } else {
                System.out.println("y : " +y + " and " + obj.y + " are equal");
            } 
            break;
        }
        while(obj.x==x){
            System.out.println("x : " +x + " and " + obj.x + " are equal");
            if (obj.y > y) {
                System.out.println("y : " +obj.y + " is greater than " + y);
            } else if (obj.y < y) {
                System.out.println("y : " +y + " is greater than " + obj.y);
            } else {
                System.out.println("y : " +y + " and " + obj.y + " are equal");
            }
            break; 
        }
    }

    boolean objEquals(Numberco obj) {
        if (obj.x == x && obj.y == y) {
            return true;
        } else
            return false;
    }

    public void objEq(Numberco obj) {
        if (obj.x > x) {
            System.out.println("x : " + obj.x + " is greater than " + x);
            if (obj.y > y) {
                System.out.println("y : " +obj.y + " is greater than " + y);
            } else if (obj.y < y) {
                System.out.println("y : " + obj.y + " is lesser than " +y);
            } else {
                System.out.println("y : " +y + " and " + obj.y + " are equal");
            }
        } else if (obj.x < x) {
            System.out.println("x : " + obj.x + " is lesser than " + x);
            if (obj.y > y) {
                System.out.println("y : " +obj.y + " is greater than " + y);
            } else if (obj.y < y) {
                System.out.println("y : " + obj.y + " is lesser than " +y);
            } else {
                System.out.println("y : " +y + " and " + obj.y + " are equal");
            }
        } else {
            System.out.println("x : " +x + " and " + obj.x + " are equal");
            if (obj.y > y) {
                System.out.println("y : " +obj.y + " is greater than " + y);
            } else if (obj.y < y) {
                System.out.println("y : " + obj.y + " is lesser than " +y);
            } else {
                System.out.println("y : " +y + " and " + obj.y + " are equal");
            }
        }
    }


    public static void main(String[] args) {
        // compares the values of two integers x and y
        Numberco obj1 = new Numberco(5, 2);
        Numberco obj2 = new Numberco(1, 1);
        Numberco obj3 = new Numberco(5, 2);
        obj1.compareNumber();
        obj2.compareNumber();
        obj3.compareNumber();

        // array of Number object
        Numberco a[] = new Numberco[3];

        a[0] = new Numberco(11, 2);
        a[1] = new Numberco(0, 9);
        a[2] = new Numberco(11, 2);

        // display the sum of x and y of each object.
        for (int i = 0; i < 3; i++) {
            a[i].findSum();
        }

        // Number class to compare two Number objects


        System.out.println("Compare two Number objects");
        a[0].objEq(a[1]);
        a[1].objEq(a[2]);
        a[2].objEq(a[0]);

        //System.out.println("obj1 == obj2: " + obj1.objEquals(obj2));
        //System.out.println("obj2 == obj3: " + obj2.objEquals(obj3));
        //System.out.println("obj1 == obj3: " + obj1.objEquals(obj3));

    }
}
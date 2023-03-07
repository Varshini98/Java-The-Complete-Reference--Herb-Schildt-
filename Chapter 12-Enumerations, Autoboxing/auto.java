class adddd {
    int add(int a, int b) {
        return a + b;
    }
}

class auto {
    public static void main(String[] args) {

        adddd a = new adddd();
        a.add(1, 2);

        Integer b1 = new Integer(5);
        // System.out.println(a.add(b1, b1));
        Integer c = a.add(b1, b1);
        System.out.println(c);

        // Integer z = 100;
        // Integer q = 100;
        // Double x = 99.3;
        // x = x + z;
        // System.out.println(x);

        int z1 = 100;
        double x1 = 99.3;
        x1 = x1 + z1;
        System.out.println(x1);

        Integer z = new Integer(100);
        Integer q = new Integer(100);

        // Integer z = 100;
        // Integer q = 100;
        // int z11 = z;
        // int q11 = q;

        //z++;

        if (z==q) {
            System.out.println("z = q");
        } else {
            System.out.println("z != q");
        }

        if (z.equals(q)) {
            System.out.println("Integer z =  Integer q");
        } else {
            System.out.println("Integer z !=  Integer q");
        }

    }
}
import java.lang.Math;

class SimpleCalculator {

    public void add(int a, int b) {

        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public void add(float a, float b) {

        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public void add(float a, int b) {

        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public void add(int a, float b) {

        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public void add(double a, double b) {

        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public void add(double a, int b) {

        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public void add(int a, double b) {

        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public void add(int a) {

        System.out.println(a + "+" + "0" + "=" + a);
    }

    public void add(float a) {

        System.out.println(a + "+" + "0" + "=" + a);
    }

    public void add(double a) {

        System.out.println(a + "+" + "0" + "=" + a);
    }

    public void add() {

        System.out.println("Null");
    }

    public void sub(int a, int b) {

        System.out.println(a + "-" + b + "=" + (a - b));
    }

    public void sub(float a, float b) {

        System.out.println(a + "-" + b + "=" + (a - b));
    }

    public void sub(float a, int b) {

        System.out.println(a + "-" + b + "=" + (a - b));
    }

    public void sub(int a, float b) {

        System.out.println(a + "-" + b + "=" + (a - b));
    }

    public void sub(double a, double b) {

        System.out.println(a + "-" + b + "=" + (a - b));
    }

    public void sub(double a, int b) {

        System.out.println(a + "-" + b + "=" + (a - b));
    }

    public void sub(int a, double b) {

        System.out.println(a + "-" + b + "=" + (a - b));
    }

    public void sub(int a) {

        System.out.println(a + "-" + "0" + "=" + a);
    }

    public void sub(float a) {

        System.out.println(a + "-" + "0" + "=" + a);
    }

    public void sub(double a) {

        System.out.println(a + "-" + "0" + "=" + a);
    }

    public void sub() {

        System.out.println("Null");
    }

    public void mul(int a, int b) {

        System.out.println(a + "*" + b + "=" + (a * b));
    }

    public void mul(float a, float b) {

        System.out.println(a + "*" + b + "=" + (a * b));
    }

    public void mul(float a, int b) {

        System.out.println(a + "*" + b + "=" + (a * b));
    }

    public void mul(int a, float b) {

        System.out.println(a + "*" + b + "=" + (a * b));
    }

    public void mul(double a, double b) {

        System.out.println(a + "*" + b + "=" + (a * b));
    }

    public void mul(double a, int b) {

        System.out.println(a + "*" + b + "=" + (a * b));
    }

    public void mul(int a, double b) {

        System.out.println(a + "*" + b + "=" + (a * b));
    }

    public void mul(int a) {

        System.out.println(a + "*" + "0" + "= 0");
    }

    public void mul(float a) {

        System.out.println(a + "*" + "0" + "= 0");
    }

    public void mul(double a) {

        System.out.println(a + "*" + "0" + "= 0");
    }

    public void mul() {

        System.out.println("Null");
    }

    public void div(int a, int b) {

        double value = (double) a / b;

        if (b == 0 && a != 0) {
            System.out.println(a + "/" + b + "=" + "ERROR: You can not divide by zero!");
        } else if (a == 0 && b != 0) {
            System.out.println(a + "/" + b + "=0");
        } else if (a == 0 && b == 0) {
            System.out.println(a + "/" + b + "= Undefined");
        } else if (value == Math.round(value)) {
            System.out.println(a + "/" + b + "=" + (a / b));
        } else {
            System.out.println(a + "/" + b + "=" + value);

        }
    }

    public void div(float a, float b) {

        if (b == 0 && a != 0) {
            System.out.println(a + "/" + b + "=" + "ERROR: You can not divide by zero!");
        } else if (a == 0 && b != 0) {
            System.out.println(a + "/" + b + "=0");
        } else if (a == 0 && b == 0) {
            System.out.println(a + "/" + b + "= Undefined");
        } else {
            System.out.println(a + "/" + b + "=" + (a / b));
        }
    }

    public void div(float a, int b) {

        if (b == 0 && a != 0) {
            System.out.println(a + "/" + b + "=" + "ERROR: You can not divide by zero!");
        } else if (a == 0 && b != 0) {
            System.out.println(a + "/" + b + "=0");
        } else if (a == 0 && b == 0) {
            System.out.println(a + "/" + b + "= Undefined");
        } else {
            System.out.println(a + "/" + b + "=" + (a / b));
        }
    }

    public void div(int a, float b) {

        if (b == 0 && a != 0) {
            System.out.println(a + "/" + b + "=" + "ERROR: You can not divide by zero!");
        } else if (a == 0 && b != 0) {
            System.out.println(a + "/" + b + "=0");
        } else if (a == 0 && b == 0) {
            System.out.println(a + "/" + b + "= Undefined");
        } else {
            System.out.println(a + "/" + b + "=" + (a / b));
        }
    }

    public void div(double a, double b) {

        if (b == 0 && a != 0) {
            System.out.println(a + "/" + b + "=" + "ERROR: You can not divide by zero!");
        } else if (a == 0 && b != 0) {
            System.out.println(a + "/" + b + "=0");
        } else if (a == 0 && b == 0) {
            System.out.println(a + "/" + b + "= Undefined");
        } else {
            System.out.println(a + "/" + b + "=" + (a / b));
        }
    }

    public void div(double a, int b) {

        if (b == 0 && a != 0) {
            System.out.println(a + "/" + b + "=" + "ERROR: You can not divide by zero!");
        } else if (a == 0 && b != 0) {
            System.out.println(a + "/" + b + "=0");
        } else if (a == 0 && b == 0) {
            System.out.println(a + "/" + b + "= Undefined");
        } else {
            System.out.println(a + "/" + b + "=" + (a / b));
        }
    }

    public void div(int a, double b) {

        if (b == 0 && a != 0) {
            System.out.println(a + "/" + b + "=" + "ERROR: Can not divide by zero!");
        } else if (a == 0 && b != 0) {
            System.out.println(a + "/" + b + "=0");
        } else if (a == 0 && b == 0) {
            System.out.println(a + "/" + b + "= Undefined");
        } else {
            System.out.println(a + "/" + b + "=" + (a / b));
        }
    }

    public void div(int a) {

        if (a == 0) {
            System.out.println(a + "/0=" + "Undefined");
        } else {
            System.out.println(a + "/0=" + "Can not divide by zero!");
            // System.out.println(a + "/" + "0" + "=" + a);
        }
    }

    public void div(float a) {

        if (a == 0) {
            System.out.println(a + "/0=" + "Undefined");
        } else {
            System.out.println(a + "/0=" + "Can not divide by zero!");
            // System.out.println(a + "/" + "0" + "=" + a);
        }
    }

    public void div(double a) {

        if (a == 0) {
            System.out.println(a + "/0=" + "Undefined");
        } else {
            System.out.println(a + "/0=" + "Can not divide by zero!");
            // System.out.println(a + "/" + "0" + "=" + a);
        }
    }

    public void div() {

        System.out.println("Null");
    }

    public static void main(String[] args) {
        SimpleCalculator cal = new SimpleCalculator();
        
        System.out.println("\n"+"ADDITION"+"\n");

        cal.add(1, 2);
        cal.add(1, -2);
        cal.add(1, -2.5);
        cal.add(1.4f, 2.5f);
        cal.add(1, 2.5f);
        cal.add(1.2, 3.4);
        cal.add(1.2, 3);
        cal.add(-1.2f, 3);
        cal.add(1, 2.3);
        cal.add(1);
        cal.add();

        System.out.println("\n"+"SUBTRACTION"+"\n");

        cal.sub(10, 3);
        cal.sub(-10, 3);
        cal.sub(7.5, 3);
        cal.sub(7.5f, 3.54);

        System.out.println("\n"+"MULTIPLICATION"+"\n");

        cal.mul(1, 5);
        cal.mul(-8, 3);
        cal.mul(4.3f, 5.3f);
        cal.mul(3, 6.4);
        cal.mul(4);
        cal.mul();

        System.out.println("\n"+"DIVISION"+"\n");

        cal.div(9, 3);
        cal.div(-4, 2);
        cal.div(10, 2.5f);
        cal.div(0, 0);
        cal.div(0, 2.4);
        cal.div(4, 0);
        cal.div();
        cal.div(0);
        cal.div(5);


    }

}

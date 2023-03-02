// Demonstrate the % operator.
class Modulus {
    public static void main(String args[]) {
        int x = 42;
        double y = 42.25;

        double a = x % y;
        int b = (int) (x % y);

        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
        
        System.out.println("double a = x % y = " + a);
        System.out.println("int b = (int) (x % y) = " + b);
    }
}
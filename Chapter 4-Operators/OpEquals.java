// Demonstrate several assignment operators.
class OpEquals {
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        int c = 0;
        a += 5; // a = a + 4
        b *= 4; // b = b * 4
        c += a * b; // c = c + (a * b)
        c %= 6;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int x = 1;
        float y = 1.1f;
        x += y;
        y += x;

        System.out.println(" x+=y " + x);
        System.out.println("y+=x " + y);

        

    }
}
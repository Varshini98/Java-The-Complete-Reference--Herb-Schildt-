class Promote {
    public static void main(String args[]) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}

/*
 * When you write float f = 5.67; the compiler doesn't know that 5.67 is a
 * float and not a double since the default type of 5.67 is a
 * double! float is less precise than a double so implicit conversion
 * cannot be done and will yield an error
 * "Type mismatch: cannot convert from double to float".
 */
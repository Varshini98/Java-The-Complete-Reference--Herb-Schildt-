// Left shifting a byte value.
class ByteShift {
    public static void main(String args[]) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i = a << 2 : " + i);
        System.out.println("b = (byte) (a << 2) : " + b);

        short z = 452;
        int j;
        j = z << 2;
        System.out.println("Original value of z: " + z);
        System.out.println("j = z << 2 : " + j);

        int v = 34546;
        long k;
        k = v << 2;
        System.out.println("Original value of v: " + v);
        System.out.println(" k = v << 2; : " + k);

        String binary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        int m,n,o,s;
        m=2;
        n=3;
        o=-4;

        s=m<<2;
        System.out.println(" m = " + m);
        System.out.println(" s = " + s);
        System.out.println(" sb = " + binary[s]);

        s=n<<2;
        System.out.println(" n = " + n);
        System.out.println(" s = " + s);
        System.out.println(" sb = " + binary[s]);
        
        s=o<<2;
        System.out.println(" o = " + o);
        System.out.println(" s = " + s);
        //System.out.println(" sb = " + binary[s]);
    }
}
class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) {
            System.out.println("x is less than y");
        }

        x = x * 2;
        if (x == y) {
            System.out.println("x now equal to y");
        }

        x = x * 2;
        if (x > y) {
            System.out.println("x now greater than y");
        }

        if (x == y) {
            System.out.println("you won't see this");
        }

        char a = 0;
char b = 6;
a += 1;
a = (char) (a * b);
a = (char) (a + b);
a = (char) (a - 16);
b = (char) (b % 3);
b = (char) (b / a);
//a = -1; // Generates complier error, must be cast to char
System.out.println(a); // Prints ? 
System.out.println((int) a); // Prints 65532
System.out.println((short) a); // Prints -4
short c = -4;
System.out.println((int) c); // Prints -4, notice the difference with char
a *= 2;
a -= 6;
a /= 3;
a %= 7;
a++;
a--;
    }
}

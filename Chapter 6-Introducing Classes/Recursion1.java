
class Factorial {
    int sum (int n) {
        if (n == 0) {
           // System.out.print("0 ");
            return 0;
        } else {
           // System.out.print("" + n);
            return sum(n - 1)+n;
        }
    }
}

class Recursion1 {
    public static void main(String args[]) {
        Factorial f = new Factorial();
        System.out.println("Sum of 3 first is " + f.sum(3));

    }
}
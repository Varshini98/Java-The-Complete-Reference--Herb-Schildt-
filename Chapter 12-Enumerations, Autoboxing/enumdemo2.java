import java.util.Scanner;

enum Frequency {
    yearly(1), halfyearly(2), quarterly(6), monthly(12);

    int f;

    Frequency(int f) {
        this.f = f;
    }

    int getfrequency() {
        return f;
    }

}

class cali {
    int a;
    Frequency freq;

    cali(int a, Frequency freq) {
        this.a = a;
        this.freq = freq;
    }

    void show() {
        System.out.println(a);
        System.out.println(freq.getfrequency());
    }

    void check() {
        int a = 2;
        int b = 3;

        if (a > b) {
            System.out.println("a>b");

        }
        if (a < b) {

            System.out.println("a<b");

        }
    }
}

class enumdemo2 {

    public static void main(String[] args) {
        cali c = new cali(3, Frequency.yearly);
        c.show();

        // Scanner sc = new Scanner(System.in);

        // System.out.println("a: ");
        // int a = sc.nextInt();
        // sc.nextLine();
        // System.out.println("freq: ");
        // Frequency s = Frequency.valueOf(sc.nextLine());

        // cali c1 = new cali(a, s);
        // c1.show();

        // System.out.println(s);
        // System.out.println(s.getfrequency());
        c.check();

    }

}

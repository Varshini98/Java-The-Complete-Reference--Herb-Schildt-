class Increment {
    public static void main(String[] args) {

        int x = 0;
        x++;
        System.out.println("x++ :" + x);

        int y = 0;
        y = y + 1;
        System.out.println("x+1 :" + y);

        System.out.println("Post-increment :");
        int i = 0;
        System.out.println("i :" + i);
        System.out.println("i++ :" + i++);
        System.out.println("i :" + i);

        System.out.println("Pre-increment :");
        int j = 10;
        System.out.println("j :" + j);
        System.out.println("j++ :" + ++j);
        System.out.println("j :" + j);

        int a = 0, b = 0, c = 0;
        int sum = 0;

        sum = a + b++ + c; // 0+0+0
        System.out.println("sum :" + sum);

        // a=0,b=1,c=0

        sum = a + ++b + c; // 0+2+0
        System.out.println("sum :" + sum);

        // a=0,b=2,c=0

        sum = a++ + b + c; // 0+2+0
        System.out.println("sum :" + sum);

        sum = a + b + c; // 1+2+0
        System.out.println("sum :" + sum);

    }
}
class Demo {
    int a;
    int b;
    public Demo() {

    }

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double addPoints(Demo value){
        double sum=((value.a-this.a)+(value.b-this.b));
        return sum;
    }

    public static void main(String[] args) {
        Demo obj1 = new Demo(1, 2);
        Demo obj2 = new Demo(3, 4);
        System.out.println(obj1.addPoints(obj2));

    }
}
class Calculator {
    int x;
    int y;
    int sum;

    public static void main(String[] args) {

        System.out.println("Default");
        Calculator cal = new Calculator();
        cal.add();

	System.out.println("Using Parameter");
        Calculator cal2 = new Calculator();
        cal2.add(1,2);
    }

    public void add() {
        x = 1;
        y = 2;
        sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = x + y;
            
            System.out.println(x +" + " +y +"=" + sum);
			x = x + 1;
            y = y + 1;
        }
    }

    void add(int a, int b) {
        x=a;
        y=b;
        sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = x + y;
            System.out.println(x +" + " +y +"=" + sum);
			x = x + 1;
            y = y + 1;
        }
    }
  
}

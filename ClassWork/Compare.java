class Compare {
    int x, y;

    Compare() {
    }

    public Compare (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void compareSign() {
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (x < y) {
            System.out.println(y + " is greater than " + x);
        } else if (x == y) {
            System.out.println(x + " and " + y + " are equal");
        } 
		
		if (x = y) {
            System.out.println(x + " and " + y + " are equal");
        }
    }

    public static void main(String[] args) {
        Compare obj = new Compare(5, 6);
        obj.compareSign();
    }

}

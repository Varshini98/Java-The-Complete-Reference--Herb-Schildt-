class Test {
    int a;

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}

class RetOb1 {
    public static void main(String args[]) {
        Test ob1 = new Test(2);
        System.out.println("ob1.a: " + ob1.a);
        
        ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);

       
        Test ob3;
        ob3 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob3.a);
    }
}
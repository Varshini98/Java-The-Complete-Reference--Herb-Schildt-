class Calculator1 {

    int x;
    int y;
    //static int sum;

    //public Calc(){
       //x=1;
       // y=2;
   // }
    
    public void add() {
       // System.out.println(x+y); 
        System.out.println(++x + ++y);
    }

    public static void main(String[] args) {

        Calculator1 cal = new  Calculator1();
        for(int i=0;i<5;i++){
            //cal.x++;
            //cal.y++;
            System.out.println("Method Call :" +i);
            cal.add();    
    }
    
}
}
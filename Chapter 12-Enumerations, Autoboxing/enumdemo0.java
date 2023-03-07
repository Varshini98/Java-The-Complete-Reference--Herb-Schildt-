enum week {
    mon(2), tue(9);

    int w;

    week(int w) {
        this.w = w;
    }

    int getweekno() {
        return w;
    }
}


public class enumdemo0 {
    public static void main(String[] args) {
        week a = week.mon;
        System.out.println(a);

        week b= week.valueOf("tue");
        System.out.println(b);

        System.out.println(a.getweekno());

        
    }
    
}

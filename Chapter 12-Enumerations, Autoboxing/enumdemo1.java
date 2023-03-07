enum Month {
    January(1), February(2), March(3), April(04), May(05), June(6), July(07), August(8), September(9), October(10),
    November(11), December(12);

    int monthno;

    Month(int monthno) {
        this.monthno = monthno;
    }

int getMonth(){
    return monthno;
}
}

class enumdemo1 {
    public static void main(String[] args) {

        Month m;
        m=Month.January;
        System.out.println(m);

        int m1;
        m1=Month.January.getMonth();
        System.out.println(m1);

        for(Month mo : Month.values()){
            System.out.println(mo);
        }

        for(Month moo : Month.values()){
            System.out.println(moo.getMonth());
        }

    }

}

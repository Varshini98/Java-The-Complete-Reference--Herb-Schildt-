class boolWrap{
    public static void main(String[] args) {
        Boolean b1 = new Boolean(true);
        System.out.println(b1);

        boolean a= true;
        Boolean b2 = new Boolean(a);
        System.out.println(b2);

        Boolean b3 = new Boolean("true");
        System.out.println(b3);

        Boolean b4 = new Boolean("false");
        System.out.println(b4);

        Boolean b5 = new Boolean("hy");
        System.out.println(b5);

        System.out.println(b1.equals(b3));
        System.out.println(b5.valueOf());

    }
    
}

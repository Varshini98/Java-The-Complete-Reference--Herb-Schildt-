class charWrap {
    public static void main(String[] args) {
        char ch1, ch2;
        ch1 = '9';
        ch2 = 'V';
        System.out.println(ch1);
        System.out.println(ch2);

       Character cr = new Character(ch1);
        boolean aaa = Character.isDigit(cr);
        System.out.println(aaa);

        Character cr4 = new Character('z');
        char c = cr4.charValue();
        System.out.println(c);

        Character cr5 = new Character('z');
        //char c1 = Character.charValue(cr5);
        System.out.println(Character.valueOf(cr5));


    }
}
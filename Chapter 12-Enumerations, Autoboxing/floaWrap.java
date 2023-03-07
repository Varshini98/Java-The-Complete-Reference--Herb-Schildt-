class floaWrap {
    public static void main(String[] args) {
        float b = 55.05F;
        String str = "45";
        double d = 10.10;
        // Construct three Float objects
        Float x = new Float(b);
        Float y = new Float(str);
        Float z = new Float(d);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        Float x1 = new Float(5.5f);
        Float y1 = new Float("67777");
        Float z1 = new Float(44.8);

        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);
    }
}
// A simple example of the switch.
class SampleSwitch {
    public static void main(String args[]) {
        // for (int i = 0; i < 6; i++)
        int i = 2;
        switch (i) {
            case 0:
                System.out.println("=0.");
                break;
            case 1:
                System.out.println("=1");
                break;
            case 2:
                System.out.println("=2");
                break;
            case 3:
                System.out.println("=3");
                break;
            default:
                System.out.println(">3");
        }
    }
}
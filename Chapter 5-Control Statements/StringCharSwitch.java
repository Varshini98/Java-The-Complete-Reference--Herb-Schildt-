// An improved version of the season program.
class StringCharSwitch {
    public static void main(String args[]) {
        char ch = 'b';

        switch (ch) {
            case 'a':
                System.out.println("=a.");
                break;
            case 'b':
                System.out.println("=b.");
                break;
            case 'c':
                System.out.println("=c.");
                break;
            default: 
                System.out.println("rest...");
        }

        String st = "a";
        switch (st) {
            case "a":
                System.out.println("=a.");
                break;
            case "b":
                System.out.println("=b.");
                break;
            case "c":
                System.out.println("=c.");
                break;
            default:
                System.out.println("rest...");
        }
    }
}
class fin {
    final int b=2;
fin(){
}
void doSome(){
    //b=4;
    System.out.print(b);
}

}

class Keyfinal {
    public static void main(String args[]) {
        fin k =new fin();   
        k.doSome();
        //k.b=3;
        //k.doSome();
    }
}

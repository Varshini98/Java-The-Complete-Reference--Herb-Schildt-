class Box {
    double width;
    double height;
    double depth;

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(double len) {
        width = height = depth = len;
    }

    Box(Box obj) {
        this.width = obj.width;
        this.height = obj.height;
        this.depth = obj.depth;
    }

    public double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, weight);
        this.weight = weight;
    }

    BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    BoxWeight(BoxWeight obj) {
        super(obj);
        this.weight = obj.weight;
    }
}

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();

        BoxWeight mybox3 = new BoxWeight();
        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();

        BoxWeight myclone = new BoxWeight(mybox1);
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();
        
        BoxWeight mycube = new BoxWeight(3, 2);
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();
    }
}
class Box {
    double width;
    double height;
    double depth;

    Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double width, double height, double depth, double weight) {
        //this.width = width;
        //this.height = height;
        //this.depth = depth;
        super(width, height,depth);
        this.weight = weight;
    }
}

class DemoBoxWeight1 {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        // BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);

        System.out.println("w " + mybox1.width);
        System.out.println("h " + mybox1.height);
        System.out.println("d " + mybox1.depth);

        Box b = new Box(2,2,3);
        System.out.println("Volume of box class " + b.volume());
        System.out.println("w " + b.width);
        System.out.println("h " + b.height);
        System.out.println("d " + b.depth);

        Box boxref = new Box();
        boxref=mybox1;

        System.out.println("Volume of box class " + boxref.volume());

    }
}

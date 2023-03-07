class Person1 {
    private String name;
    private String address;
    private String phoneno;

    public Person1() {
    }

    public Person1(String name, String address, String phoneno) {
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
    }

    public void displayDetails() {
        System.out.println(" " + name + "\n " + address + "\n " + phoneno + "\n ");

    }

    public void displayPhoneno() {
        System.out.println("Phone:" + phoneno);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phoneno;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setAddress(String address) {
        this.address=address;
    }

    public void setPhone(String phoneno) {
        thid.phoneno=phoneno;
    }

    public static void main(String[] args) {

        System.out.println("Person Details: ");
        // Display the details of 5 persons.
        Person1 obj1 = new Person1("Rose", "35 Lakeview Street Iowa City, IA 52240", "8555667664");
        obj1.displayDetails();
        Person1 obj2 = new Person1("Alex", "9578 Lake Forest Ave. Clarksville, TN 37040", "9875667664");
        obj2.displayDetails();
        Person1 obj3 = new Person1("Ten", "341 Ann St. Zanesville, OH 43701", "9812345464");
        obj3.displayDetails();
        Person1 obj4 = new Person1("Blair", "8480 Cedar St. Port Chester, NY 10573", "9945673236");
        obj4.displayDetails();
        Person1 obj5 = new Person1("Kate", "362 Delaware Court Anaheim, CA 92806", "6342545236");
        obj5.displayDetails();
        Person1 obj6 = new Person1();
        obj6.displayDetails();

        // Displaying phone number of a person
        obj1.displayPhoneno();
        obj2.displayPhoneno();
        obj3.displayPhoneno();
        obj4.displayPhoneno();
        obj5.displayPhoneno();

        // getter Method
        System.out.println("Address :" + obj1.getAddress());

        // setter Method
        obj1.setName("Varshini");
        obj1.displayDetails();

        // ObjectArray
        System.out.println("\n" + "Displaying person's details using ObjectArray: " + "\n");

        Person1 array[] = new Person1[5];

        // array[0] = new Person1("Rose", "35 Lakeview Street Iowa City, IA
        // 52240","8555667664");
        array[0] = obj1;
        // array[1] = new Person1("Alex", "9578 Lake Forest Ave. Clarksville, TN
        // 37040","9875667664");
        array[1] = obj2;
        // array[2] = new Person1("Ten", "341 Ann St. Zanesville, OH
        // 43701","9812345464");
        array[2] = obj3;
        // array[3] = new Person1("Blair", "8480 Cedar St. Port Chester, NY
        // 10573","9945673236");
        array[3] = obj4;
        // array[4] = new Person1("Kate", "362 Delaware Court Anaheim, CA
        // 92806","6342545236");
        array[4] = obj5;

        // print using for loop
        for (int i = 0; i < 5; i++) {
            array[i].displayDetails();
        }

    }

}
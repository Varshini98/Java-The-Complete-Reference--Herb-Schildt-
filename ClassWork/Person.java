class Person1 {
    String name;
    String address;
    String phoneno;

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

}

class Person2 {

    Person2() {
    }

    public void displayPhoneno(Person1 obj) {
        System.out.println("Phone:" + obj.phoneno);
    }

}

class Person3  {
   
    Person3() {
    }

    public void displayDetails(Person1 obj) {
        System.out.println(" " + obj.name + "\n " + obj.address + "\n " + obj.phoneno + "\n ");
    }

}

class Person {
    public static void main(String[] args) {

        // Display the details of 5 persons.
        Person1 obj1 = new Person1("One", "Kerala, India", "1111111111");
        obj1.displayDetails();
        Person1 obj2 = new Person1("Two", "Karnataka, India", "2222222222");
        obj2.displayDetails();
        Person1 obj3 = new Person1("Three", "Tamil Nadu, India", "3333333333");
        obj3.displayDetails();
        Person1 obj4 = new Person1("Four", "Maharastra, India", "4444444444");
        obj4.displayDetails();
        Person1 obj5 = new Person1("Five", "Delhi, India", "5555555555");
        obj5.displayDetails();

        // Displaying phone number of a person
        Person2 p1 = new Person2();
        p1.displayPhoneno(obj1);
        p1.displayPhoneno(obj2);
        p1.displayPhoneno(obj3);
        p1.displayPhoneno(obj4);
        p1.displayPhoneno(obj5);

        // ObjectArray
        System.out.println("\n" + "Displaying person's details using ObjectArray: " + "\n");

        Person3 array[] = new Person3[3];

        for (int i = 0; i < 3; i++) {
            array[i] = new Person3();
        }

        System.out.println("Array Element 0");
        array[0].displayDetails(obj1);
        System.out.println("Array Element 1");
        array[1].displayDetails(obj2);
        System.out.println("Array Element 2");
        array[2].displayDetails(obj3);
    }
}
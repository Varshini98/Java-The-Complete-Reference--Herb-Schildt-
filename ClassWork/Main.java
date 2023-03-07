class Person {
	String name;
	String address;
	String phoneno;

	public Person() {

	}

	public Person(String name, String address, String phoneno) {
		this.name = name;
		this.address = address;
		this.phoneno = phoneno;
	}

	public void display() {
		System.out.println(name + "\t" + address + "\t " + phoneno);

	}
}

class Main {
	public static void main(String[] args) {
		Person obj1 = new Person("Rose", "abc street, 52240", "8555667664");
		obj1.display();
		// obj2 point to same reference obj1
		Person obj2 = obj1;
		obj2.display();

		obj2.name="Hai";
		obj1.display();

		obj1=null;
		obj1.display();
		obj2.display();

		//obj1 = null;
		
		// updating the value using reference variable
		//obj1.name = "Alex";
		//obj1.display();
		//obj2.display();
		
		//obj2.phoneno = "2375489763";
		//obj1.display();
		//obj2.display();

	}
}

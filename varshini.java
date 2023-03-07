class address {
	void addr(){
		System.out.println("Address");
	}
}

class person {
	void per(){
		System.out.println("Person");
	}
	
	address obj = new address();
	
}

class student extends person {
	void stu(){
		System.out.println("student");
		
	}
}

class varshini {
	public static void main(String args[]){
		student obj1 = new student();
		obj1.stu();
		obj1.per();
		address a = obj1.obj;
		a.addr();
		
	}
}




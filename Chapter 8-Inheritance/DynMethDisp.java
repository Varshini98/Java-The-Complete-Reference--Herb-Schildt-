class Phone {
    public void showTime() {
        System.out.println("Time is 11 am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

public class DynMethDisp {
    public static void main(String[] args) {

        SmartPhone s= new SmartPhone();
		Phone obj1;
        obj1=s;
        
		obj1.showTime(); //s.showTime();
        obj1.on(); //s.on();

		Phone p =new Phone();
        obj1=p;
        obj1.showTime(); //p.showTime();
        obj1.on(); //p.on();

		
		Phone obj = new SmartPhone(); 
    
		obj.on();
        obj.showTime();  
        //obj.music();
    }
}

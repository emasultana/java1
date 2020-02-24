package finalvariable;

public class finaldemo {
	
	final int speed=40;
	
	public static void main(String[] args) {
	
		finaldemo fd=new finaldemo();
		//fd.speed=100;
        fd.speed=40;
		System.out.println(fd.speed); 
	}

}
//in security field we use 'final'.CLOUD tech doesn't let you use 'final'.

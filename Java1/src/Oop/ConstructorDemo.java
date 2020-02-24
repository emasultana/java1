package Oop;

public class ConstructorDemo {
//default constructor we provide values in centric class not in the main/execution class

	int x;
	int y;
	
ConstructorDemo ()
{
	x=10;
	y=20;
}
	
	void display ()
	{
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {

ConstructorDemo cd1=new ConstructorDemo();
cd1.display();

	}

}

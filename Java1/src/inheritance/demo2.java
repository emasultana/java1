package inheritance;
class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}
class C extends B
{
	int c;
	void show()
	{
		System.out.println(c);//method/logic
	}
}

public class demo2 {

	public static void main(String[] args) {
	
	C cobj=new C();
	cobj.a=10;
	cobj.b=20;
	cobj.c=30;
	
	cobj.display();
	cobj.print();
	cobj.show();

	}

}
//use: jaba in back end, html in front end, selenium for web testing
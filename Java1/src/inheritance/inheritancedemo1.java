package inheritance;
//parent class.independent class with its own datatype, logic, method, variables

class A 

{
	int a;
	void display()
	{
		System.out.println(a);
	}
}
 
class B extends A // B is child class, A is parent class
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}


public class inheritancedemo1 {

public static void main(String[] args) {
		
A aobj=new A();

aobj.a=100;
aobj.display();

B bobj=new B();
bobj.b=200;
bobj.a=100;

bobj.display();
bobj.print();
	}

}
// why do it like this? integrate multiple class together
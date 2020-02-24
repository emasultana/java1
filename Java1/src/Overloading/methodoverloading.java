package Overloading;

public class methodoverloading {
//method overloading is a feature that allows a class to have more
//than one method have the same name
	void add (int a, int b)
	{
		System.out.println(a+b);
	}

	void add (int a, double b)
	{
		System.out.println(a+b);
	}
	
	void add (double a, double b)
	{
		System.out.println(a+b);
	}
	
	void add (int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		
methodoverloading mol=new methodoverloading();
mol.add(10, 20);
mol.add(10, 10.5);
mol.add(10.2, 10.2);
mol.add(10, 10, 10);
	}
	

}

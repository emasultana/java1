package Overloading;

public class withoutoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add1 (int a, int b)
		{
			System.out.println(a+b);
		}

		int add2 (int a, double b)
		{
			System.out.println(a+b);
		}
		
		int add3 (double a, double b)
		{
			System.out.println(a+b);
		}
		
		
		
		int add4 (int a, int b, int c)
		{
			System.out.println(a+b+c);
		}
		methodoverloading mol=new methodoverloading();
		mol.add1(10, 20);
		mol.add2(10, 10.5);
		mol.add3(10.2, 10.2);
		mol.add4(10, 10, 10);
			}
			

		}//he just showed it, didn't run the code


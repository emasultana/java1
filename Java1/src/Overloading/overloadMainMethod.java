package Overloading;

public class overloadMainMethod {
public void main(int x)
{
	System.out.println(x);
}

public void main(int x,int y)
{
	System.out.println(x+y);
}

public static void main(String[] args) {
	overloadMainMethod om=new overloadMainMethod();
	om.main(100);
	om.main(100, 100);

	}

}

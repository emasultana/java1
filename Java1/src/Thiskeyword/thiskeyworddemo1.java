package Thiskeyword;
//keyword "THIS" is a reference variable in JAVA that refers to current object
public class thiskeyworddemo1 {
	int a,b;//instance variable
	void getvalues (int a, int b)// method variable
	{
	 this.a=a;//statement or execution of the particular function
	 this.b=b;
	}
	void printValues ()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		
	thiskeyworddemo1 tkw=new thiskeyworddemo1();
	tkw.getvalues(10,200);
	tkw.printValues();
	
		


	}

}

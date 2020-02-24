package arrays;

public class arraysdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) declare an array
		int a[]=new int[5];//declared array with size 5, starting index is 0,
		//last index is 9
		//2) insert values into array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;	
		
		//3) find size of an arrays
		//System.out.println("Length of an array: "+a.length);//print length/soze of an arrays
		//4) read values from arrays
		
		//System.out.println(a[2]);
		for(int i=0;i<=a.length-1;i++)
			
		{
			System.out.println(a[i]);
		}
		
		

	}

}

package multidimensionArray;

public class multidimarraydemo1 {

	public static void main(String[] args) {
	
		

int a[][]= {{100,200},{300,400},{500,600}};

System.out.println("NUmber of rows" + a.length);
System.out.println("Number of Column" + a[0].length);
 
//enhanced two dimension array or enhanced looping

for (int r[]:a)

{
	for(int i:r)
	{
		System.out.println(i);
	}
}
 
	}
}


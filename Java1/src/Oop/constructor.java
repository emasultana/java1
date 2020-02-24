package Oop;

public class constructor {

	int sid;
	String sname;
	char grade;
//when using constructor use the same name as class for method,like we are using constructor on the below line
	
constructor(int id,String name,char g)
{
sid=id;
sname=name;
grade=g;

}
void display()
{
System.out.println(sid+" "+sname+" "+grade);

}

	
	
	
}

package Oop;

public class studentAnkur {

	int sid;
	String sname;
	char grade;
	
void getvalues(int id,String name,char g)
//method
{
	sid =id;
	sname=name;
	grade=g;
}
void display()
{
	System.out.println(sid+" "+sname+" "+grade);
}

}

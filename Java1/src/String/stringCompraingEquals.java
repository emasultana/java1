package String;

public class stringCompraingEquals {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println(s.equals("welcome"));
		System.out.println(s.equals("wel come"));
		System.out.println(s.equals("we l come"));
		//to avoid the case sensitivity
		System.out.println(s.equalsIgnoreCase("wElCome"));
		
		
		
		

	}

}

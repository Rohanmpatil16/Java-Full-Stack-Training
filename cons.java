package sit_college;

public class cons {

	 cons()
	{
		System.out.println("hello");
		
	}
	 
	 cons(int x)
	 {
		 System.out.println(x); 
	 }
	
	public static void main(String[] args)
	{
		cons a=new cons(10);
		cons b=new cons();
//		a.cons();
	}
}

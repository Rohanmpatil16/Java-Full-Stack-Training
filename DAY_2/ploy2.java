package DAY_2;

class ab{
	void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
}


public class ploy2 extends ab {
	void add()
	{
		
		int a=30;
		int b=40;
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		ploy2 o=new ploy2();
		o.add();
	}

}

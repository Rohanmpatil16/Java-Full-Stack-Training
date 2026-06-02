package DAY_2;

abstract class ab {
		
	abstract void sterieo();
}

class bmw extends ab{
	void sterieo()
	{
		System.out.println("vivek");
		System.out.println("banda");
		System.out.println("patil");
	}
}

public class abstraction
{
	public static void main(String args[])
	{
		bmw b=new bmw();
		
		b.sterieo();
	}
}
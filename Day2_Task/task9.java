package Day2_Task;

class father{
	void marriage()
	{
		System.out.println("marriage with banda");
	}
}

class son extends father{
	void marriage()
	{
		System.out.println("love marriage");
	}
}
public class task9 extends son  {
	public static void main(String[] args) {
		task9 o=new task9();
		o.marriage();
	}

}

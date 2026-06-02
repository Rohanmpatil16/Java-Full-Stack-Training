package Day2_Task;


abstract class vehicle{
	abstract void start();
	
}
public class task7 {
	
	void start()
	{
		System.out.println("bike started");
	}
	
	public static void main(String[] args) {
		task7 o=new task7();
		o.start();
		
	}

}

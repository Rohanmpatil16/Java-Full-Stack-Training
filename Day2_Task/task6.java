package Day2_Task;


abstract class animal{
	abstract void sound();
}
public class task6 {
	void sound()
	{
		System.out.println("Dog bark");
	}
	public static void main(String[] args) {
		task6 o=new task6();
		o.sound();
	}

}

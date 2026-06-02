package Day2_Task;


abstract class shape{
	abstract void draw();
}

class circle{
	void draw()
	{
		System.out.println("Drawing circle");
	}
}
class rectangle extends circle{
	void draw()
	{
		System.out.println("Drawing rectangle");
	}
}
	

public class task10 {
	public static void main(String[] args) {
		circle o=new circle();
		rectangle oo=new rectangle();
		
		o.draw();
		oo.draw();
	}
}

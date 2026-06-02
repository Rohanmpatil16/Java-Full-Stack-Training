package Day2_Task;

public class task8 {
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		task8 o=new task8();
		o.add(10,20);
		o.add(10,20,30);
	}

}

package Day_3;

class jarvis implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("Jarvis system");
	}
}

class wepons implements Runnable{
	public void run()
	{
		for(int i=1;i<=5;i++)
			System.out.println("wepon system");
	}
}

public class runn {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		jarvis o=new jarvis();
		
		wepons c=new wepons();
		
		Thread t1=new Thread(o);
		
		Thread t2=new Thread(c);
		
		Thread.sleep(2000);
		t1.start();
		Thread.sleep(2000);
		t2.start();
		Thread.sleep(2000);
		
		}

}

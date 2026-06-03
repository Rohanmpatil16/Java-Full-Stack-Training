package Day_3;


class a extends Thread
{
	public void run() {
	try {
		System.out.println("hlo");
		Thread.sleep(2000);
		System.out.println("buy");
	}
	catch(InterruptedException e) {
		e.printStackTrace();
		
	}
	}
}
public class thread extends Thread {
	public static void main(String[] args) throws Exception{
		a o=new a();
		o.start();
//		Thread.sleep(1000);
		System.out.println("run");
		
	}
}

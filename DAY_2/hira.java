package DAY_2;



class father{
	void a()
	{
		
		System.out.println("hlo");
	}
}

class daughter extends father{
	void b()
	{
		
		System.out.println("hlo dad");
	}
}
public class hira extends father {

	void c()
	{
		System.out.println("hlo father");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hira o=new hira();
		o.a();
		
		o.c();
		
		daughter oo=new daughter();
		oo.a();
		oo.b();
	}

}

package DAY_2;

//super class
class a{
	void aa(){
		System.out.println("grand father");
	}
}
//parent class
class b extends a{
	void bb()
	{
		System.out.println("father");
	}
}
//child class
public class multilevel extends b {
	public static void main(String[] args) {
		multilevel o=new multilevel();
		o.aa();
		o.bb();
		
		
	}

}

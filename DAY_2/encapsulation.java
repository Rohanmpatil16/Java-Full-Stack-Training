package DAY_2;

public class encapsulation {
	
	private String name;
	
   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//	public String getName()
//	{
//		return name;
//	}
//	
//	public void setName(String name)
//	{
//		this.name=name;
//	}
	public static void main(String[] args) {
		encapsulation s=new encapsulation();
		s.setName("rohan");
		System.out.println(s.getName());
	}
}

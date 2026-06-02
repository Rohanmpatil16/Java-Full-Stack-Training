package Day2_Task;


class student{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class task3 extends student{
public static void main(String[] args) {
	
	task3 o=new task3();
	o.setName("rohan");
	System.out.println(o.getName());
}
}

package Day2_Task;


class employee{
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}

public class task5 extends employee {
	public static void main(String[] args) {
		task5 o=new task5();
		o.setCompany("TCS");
		System.out.println("Company Name:"+o.getCompany());
		
		
	}

}

package Day2_Task;



class bank_account{
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}


public class task4 extends bank_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task4 o=new task4();
		o.setBalance(1000);
		System.out.println(o.getBalance());

	}

}

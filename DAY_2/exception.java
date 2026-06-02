package DAY_2;

public class exception {
	public static void main(String[] args) {
		try {
			int arr[]= {1,2,3};
			System.out.println(arr[5]);
		}
		catch(Exception e)
		{
			System.out.println("Inavalid array");
		}
	}

}

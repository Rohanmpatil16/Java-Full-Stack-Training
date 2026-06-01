package sit_college;

import java.util.Scanner;

public class para {
	
	 void a(String a)
	{
		System.out.println(a);
	}
	
	void c(int x)
	{
		if(x%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		para b=new para();
		String name=sc.nextLine();
		
		int num=sc.nextInt();
		
		b.a(name);
		b.c(num);
	}

}

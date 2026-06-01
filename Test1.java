package Test;
import java.util.*;

public class Test1 {
	
	public void z(int j,int k) {

		int addd=j+k;
		System.out.println(+addd);
	}
	

	public static void main(String[] args) {
		
		Test1 o=new Test1();
		o.z(10,20);
		// TODO Auto-generated method stub
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("even");
			
		}
		else {
			System.out.println("odd");
		}
		
		System.out.println("enter the three numbers");
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		if(b>c && b>d)
		{
			System.out.println(b+ " b is greater");
		}
		else if(c>b && c>d)
		{
			System.out.println(c+ " c is greater");
		}
		else
		{
			System.out.println(d +" d is greater");
		}
		
		System.out.println("Enter the number for table");
		int e=sc.nextInt();
		
		System.out.println("the table of " +e+ "is=");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+ " * " +e+ " = " +i*e);
		}
		
		System.out.println("Enter the number to words addition");
		int f=sc.nextInt();
		int add=0;
		for(int i=1;i<=f;i++)
		{
			add+=i;
		}
		System.out.println(add);
		
		System.out.println("print 1 to 20");
		for(int i=1;i<=20;i++)
		{
			
			if(i==11)
			{
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("print 1 to 20");
		for(int i=1;i<=20;i++)
		{
			
			if(i%3==0)
			{
				continue;
			}
			System.out.println(i);
		}
		
		
		int a[]=new int[5];
		System.out.println("Enter the 5 nmber array:");
		for(int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
		
		System.out.println("the array is:");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		
		int a[]= {10,20,30,40,6,4,20};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max num is:"+max);
		
		System.out.println("Enter your name:");
		String a=sc.nextLine();
		int c=0;
		System.out.println("Upper Case "+a.toUpperCase());
		for(int i=0;i<a.length();i++)
		{
			c++;
		}
		System.out.println("length of string is "+c);
		System.out.println("First character is "+a.charAt(0));
		
		ArrayList<String> ab=new ArrayList<>();
		ab.add("rohan");
		ab.add("rohan");
		ab.add("rohan");
		ab.add("rohan");
		
		for(int i=0;i<ab.size();i++)
		{
			System.out.println(ab.get(i));
		}
		
		
		System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int marks[] = new int[5];
        int total = 0;

        System.out.println("Enter 5 Subject Marks:");

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = total / 5.0;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);

        if (percentage > 75) {
            System.out.println("Grade: Distinction");
        } else if (percentage > 60) {
            System.out.println("Grade: First Class");
        } else if (percentage > 40) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade: Fail");
        }

		
		
		
		
	}

}

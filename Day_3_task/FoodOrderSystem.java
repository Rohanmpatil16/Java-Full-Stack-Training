package Day_3_task;
import java.util.*;

class welcome{
	Scanner sc=new Scanner(System.in);
	void dis()
	{
		System.out.println("Welcome to food mart");
	}
	
	void dis1()
	{
		System.out.println("what you wanna eat");
		System.out.println("press 1 for veg & press 2 for non veg");
		
		
		
		int i=sc.nextInt();
		switch(i)
		{
		
		case 1:
			System.out.println("Veg Menu");
            System.out.println("1. Paneer");
            System.out.println("2. Veg Biryani");
           
            
            int veg=sc.nextInt();
            
            switch(veg)
            {
            case 1:
            	System.out.println("You selected panner");
            	break;
            
            case 2:
            	System.out.println("You selected veg biryani");
            	break;
            }
            
		case 2:
			 System.out.println("Non-Veg Menu");
             System.out.println("1. Chicken Biryani");
             System.out.println("2. Chicken Curry");
             
             int nonveg=sc.nextInt();
             
             switch(nonveg)
             {
             case 1:
             	System.out.println("You selected chicken biryani");
             	break;
             
             case 2:
             	System.out.println("You selected chicken curry");
             	break;
             }
             
		default:
            System.out.println("Invalid Choice");

		}
	}
	
	void dis2()
	{
		System.out.println("Order Confirmation");
		
		int c=sc.nextInt();
		
		switch(c) {
		case 1:
			System.out.println("Thanku for Confirmation");
			break;
		
		case 2:
			System.out.println("Order Confirmed");
			break;
		}
		
	}
}
public class FoodOrderSystem {
	public static void main(String[] args) {
		
	}

}

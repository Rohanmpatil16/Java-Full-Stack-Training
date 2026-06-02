package DAY_2;
import java.util.*;
public class iterator {
	public static void main(String[] args) {
		ArrayList<String> n=new ArrayList<String>();
		n.add("vivek");
		n.add("vivek");
		n.add("rohan");
		
		Iterator<String>it =n.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
}

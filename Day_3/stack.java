package Day_3;
import java.util.*;
public class stack {
public static void main(String[] args) {
	Stack<String>b=new Stack<String>();
	b.push("vivek");
	b.push("rohan");
	b.push("apurv");
	
	System.out.println(b);
	System.out.println(b.peek());
	System.out.println(b.push("parshw"));
	System.out.println(b);
	System.out.println(b.pop());

}
}

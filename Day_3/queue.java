package Day_3;
import java.util.*;
public class queue {

	public static void main(String[] args) {
		
		Queue<String>q=new LinkedList<>();
		 q.offer("rohan");
		 q.offer("vivek");
		 q.offer("apurv");
		 
		 System.out.println(q);
		 q.poll();
		 System.out.println(q);
		 System.out.println(q.peek());

	}

}

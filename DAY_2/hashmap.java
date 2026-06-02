package DAY_2;
import java.util.*;
public class hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1, "vivek");
		map.put(2, "rohan");
		
		map.put(2, "ram");
		map.put(3, "rohan");
		
		System.out.println(map);
	}

}

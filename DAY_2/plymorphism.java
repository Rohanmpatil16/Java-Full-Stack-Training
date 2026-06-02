package DAY_2;

public class plymorphism {
	
	
		void add(int a,int b)
		{
			System.out.println(a+b);
		}
		
		void add(int a,int b,int c) {
			System.out.println(a+b+c);

		}
		
		public static void main(String[] args) {
			plymorphism o=new plymorphism();
			o.add(10,20,30);
			o.add(10,20);
	}

}

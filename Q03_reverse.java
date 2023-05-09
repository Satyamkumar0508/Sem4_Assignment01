
public class Q03_reverse {
	

		static void reverse(int n) {
			
			while(n>0) {
				int rem=n%10;
				n=n/10;
				System.out.print(rem);
			}
			
			
		}
	
		

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(1000000);
	}

}

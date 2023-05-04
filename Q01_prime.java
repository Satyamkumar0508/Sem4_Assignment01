
public class Q01_prime {

	public static boolean isprime(int x) {
		if(x==0||x==1) {
			return false;
		}
		else {
			for(int i=2;i<x;i++) {
				if(x%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	public static void main(String[] args) {
		System.out.println(isprime(2));
		
	}

}

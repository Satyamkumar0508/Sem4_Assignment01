
public class Q15_GCD {
	public static int findgcd(int a,int b) {
		if(b==0) {
			return a;
		}
		return findgcd(b,a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=15;
		int b=10;
		System.out.println("gcd is"+ findgcd(a,b));
	}

}

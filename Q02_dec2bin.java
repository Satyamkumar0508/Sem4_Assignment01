public class Q02_dec2bin {
	public static void dec2binary(int x) {
				int A[]=new  int[32];
				int i=0;
				while(x>0) {
					A[i]=x%2;
					x=x/2;
					i++;
				}
				for(int j=i-1;j>=0;j--) {
					System.out.print(A[j]);
				}
			} 
			public static void main(String[] args) {
				int x=9;
				dec2binary(x);
			}	
}

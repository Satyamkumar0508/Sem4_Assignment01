
public class Q07_ArraytoWave {

	public static void swap(int[]a,int start,int end) {
		int temp=a[start];
		a[start]=a[end];
		a[end]=temp;
	}
	public static void arrayToWave(int[]n) {
		for(int i=0;i<n.length;i+=2) {
			if((i-1)>0&&n[i]>n[i-1]) {
				swap(n,i,i-1);
			}
			if((i+1)<n.length&&n[i]>n[i+1]) {
				swap(n,i,i+1);
			}
						
		}
	}
	public static void printdetails(int[]arr1) {
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7};
		arrayToWave(a);
		printdetails(a);

	}

}

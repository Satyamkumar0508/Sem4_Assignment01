
public class Q12_maxIndexDiff {

	public static int MaxIndexDiff(int arr[],int n) {
		int maxdiff=-1;
		int i,j;
		for( i=0;i<n;i++) {
			for(j=n-1;j>i;j--) {
				if(arr[j]>arr[i]&&maxdiff<(j-i)) {
					maxdiff=j-1;
				}
			}
		}
		return maxdiff;
	}
	public static void main(String[] args) {
		int arr[]= {9,2,3,4,5,6,7,8,18,0};
		int n=arr.length;
		System.out.println("maxdiff : "+ MaxIndexDiff(arr,n));

	}

}

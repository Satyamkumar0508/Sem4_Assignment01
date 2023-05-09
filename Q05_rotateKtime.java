
public class Q05_rotateKtime {
	public static void swap(int[]a,int start,int end) {
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
	public static void rotate(int[]arr,int value) {
		swap(arr,0,value-1);
		swap(arr,value,arr.length-1);
		swap(arr,0,arr.length-1);
	}

	public static void printdetails(int[]arr1) {
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
	public static void main(String[] args) {
	
		int arr[]= {33,4,5,66,7,8,99};
		int value=2;
		rotate(arr,value);
		printdetails(arr);

	}

}

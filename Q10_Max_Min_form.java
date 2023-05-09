
public class Q10_Max_Min_form {

	public static void minmax(int[]a,int size) {
		int []a1 =new int [size];
		for (int i = 0; i < size; i++) {
			a1[i] = a[i];
			}

		int start=0;
		int stop=size-1;
		for(int i=0;i<size;i++) {
			if(i%2==0) {
				a[i]=a1[stop];
				stop--;
				
			}
			else {
				a[i]=a1[start];
				start++;
			}	
		}
		
	}
	public static void printdetails(int[]arr1) {
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8};
		minmax(a,a.length);
		printdetails(a);
		
	}

}

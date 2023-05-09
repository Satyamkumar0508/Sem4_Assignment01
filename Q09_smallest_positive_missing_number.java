
public class Q09_smallest_positive_missing_number {

	public static int missing(int[]a,int size) {
		 for(int i=0;i<size;i++) {
			 int temp=a[i];
			 a[i]=a[temp-1];
			 a[temp-1]=temp;
		 }
		 for(int i=0;i<size;i++) {
			 if(a[i]!=i+1){
				 return i+1;
			 }
		 }
		 return -1;
	}
	public static void main(String[] args) {
		
		int a[]= {2,2,3,4,5};
		int size=a.length;
		System.out.println(missing(a,size));
	}

}

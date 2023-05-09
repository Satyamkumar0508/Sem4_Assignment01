
public class Q08_IndexArray {

	public static void IndexArray(int[]a,int size) {
		for(int i=0;i<size;i++) {
			while(a[i]!=-1&&a[i]!=i) {
				int temp=a[i];
				a[i]=a[temp];
				a[temp]=temp;
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
		int a[]= {8,-1,6,1,9,3,2,7,4,-1};
		int size=a.length;
	    IndexArray(a,size);
	    printdetails(a);
		

	}

}

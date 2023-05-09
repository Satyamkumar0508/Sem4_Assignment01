
public class Q16_permutation {
	public static void permutation(int[]arr,int i, int length) {
		if(length==i) {
			printarray(arr,length);
				}
		int j=i;
		for(j=i;j<length;j++) {
			swap(arr,i,j);
			permutation(arr,i+1,length);
			swap(arr,i,j);
							
				}	
	}
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void printarray(int[]arr,int length) {
		length=arr.length;
		for(int i=0;i<length;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int []arr= {2,5,6};
		permutation(arr,0,3);

	}

}

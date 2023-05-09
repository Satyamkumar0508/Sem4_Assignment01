
public class Q11_maxCirSum {

	public static int maxcirsum(int[]a,int size) {
		size=a.length;
		int sum=0;
		int currsum=0;
		int maxsum=0;
		for(int i=0;i<size;i++) {
			sum+=a[i];
			currsum+=a[i]*(i+1);
			}
		maxsum=currsum;
		for(int i=0;i<size;i++) {
			currsum=(currsum+sum)-(size*a[size-1]);
			if(currsum>maxsum) {
				maxsum=currsum;
			}
		}
		return maxsum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,9,8,-7,6,5,4,3,2,1};
		System.out.println("maxsum is "+ maxcirsum(a,a.length));

	}

}


public class Q06_maxContigousSubarray {
	public static int maxsum(int[]a) {
		int maxsum=0;
		int cursum=0;
		for(int i=0;i<a.length;i++) {
			cursum+=a[i];
			if(cursum>maxsum) {
				maxsum=cursum;
				
			}
			if(cursum<0) {
			    cursum=0;
			    
			}
			
		}
		return maxsum;
	}

	public static void main(String[] args) {
		int[]a= {2,3,-5,5,6,-10,2};
		System.out.println(maxsum(a));
	}

}

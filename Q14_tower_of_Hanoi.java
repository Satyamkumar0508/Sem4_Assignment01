
public class Q14_tower_of_Hanoi {
	public static void move(int n, char pole1,char pole3, char pole2) {
		if(n<1) {
		 return;
		}
		move(n-1,pole1,pole2,pole3);
		System.out.println("move disk"+n+"from"+pole1+"to"+pole3);
		move(n-1,pole2,pole3,pole1);
	}

	public static void main(String[] args) {
		int n=4;
		System.out.println("the sequence of moves are: ");
	    move(n,'A','C','B');

	}

}

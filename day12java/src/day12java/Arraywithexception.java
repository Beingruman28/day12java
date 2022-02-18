package day12java;

public class Arraywithexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		for(int i = 0 ; i< 7 ; i++) {
			try {
				System.out.println("a" + a[i]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	} System.out.println("i am out of loop");
	}
}

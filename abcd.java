package ujwal;

public class abcd{
	int a = 66;
   static	int cc = 99;
	void m1() {
		int a = 10;
		System.out.println("qwertyuiop" + a);
	}
	public abcd() {
		int b = 10;
		System.out.println("sdf" + b);
	}
	public static void main(String[] args) {
		abcd test = new abcd();// object
		test.m1();
		System.out.println("thank you"+test.a);
		System.out.println(cc);
		System.out.println(abcd.cc);

	}
}
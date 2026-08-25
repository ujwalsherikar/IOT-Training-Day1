package TrainingDay2;

public class Demo8 {

	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		Demo8 test = new Demo8();
		test.setA(11);
		int aa = test.getA();
		System.out.println(aa);
	}
}
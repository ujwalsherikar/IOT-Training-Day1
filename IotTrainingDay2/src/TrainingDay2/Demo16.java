package TrainingDay2;

class parent2 {
	int a = 5;
	int b = 4;
}

public class Demo16 extends parent2 {
	int a = 50;
	int b = 49;

	void add(int a, int b) {
		System.out.println(super.a + super.b);
		System.out.println(this.a + this.b);
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Demo16 jj = new Demo16();
		jj.add(500, 499);
	}
}
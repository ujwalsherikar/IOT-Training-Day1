package TrainingDay2;

class Parent3 {
	void cancer() {
		System.out.println(" understain");
	}

	void bp() {
		System.out.println(" understain   bp");
	}
}

public class Demo9 extends Parent3 {
	public static void main(String[] args) {
		Demo9 bb = new Demo9();
		bb.bp();
		bb.cancer();
	}
}
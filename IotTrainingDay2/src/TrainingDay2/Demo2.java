package TrainingDay2;

class Parents {
	void property() {
		System.out.println("Property");
	}

	void marry() {
		System.out.println("famaily selected girl/boy");
	}
}

public class Demo2 extends Parents {
	void marry() {
		System.out.println("campus selected girl/boy");
	}

	public static void main(String[] args) {
		Demo2 test = new Demo2();// object
		test.marry();
		test.property();

	}
}

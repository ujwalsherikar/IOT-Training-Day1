package TrainingDay2;

class GrandParent1 {
	void bp() {
		System.out.println("understain bp");
	}
}

class Parent extends GrandParent1 {
	void cancer() {
		System.out.println("understain");
	}
}

public class Demo11 extends GrandParent {
	public static void main(String[] args) {
		Demo11 bb = new Demo11();
		bb.bp();
		bb.cancer();
	}

	private void cancer() {
	}
}

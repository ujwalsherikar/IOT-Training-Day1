package TrainingDay2;

class GrandParent {
	void bp() {
		System.out.println(" understain   bp");
	}
}

class parents extends GrandParent {
	void cancer() {
		System.out.println(" understain");
	}

}

public class Demo10 extends Parent {

	public static void main(String[] args) {
		Demo10 bb = new Demo10();
		bb.bp();
		bb.cancer();
	}
}
package TrainingDay2;

interface Atm {
	abstract void depo();

	abstract void with();
}

abstract class Abc implements Atm {
	public void depo() {
		System.out.println("Depos");
	}
}

public class Demo17 extends Abc {
	public void with() {
		System.out.println("With");
	}

	public static void main(String[] args) {
		Demo17 v = new Demo17();
		v.depo();
		v.with();
	}
}

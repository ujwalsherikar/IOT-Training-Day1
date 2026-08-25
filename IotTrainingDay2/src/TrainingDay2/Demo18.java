package TrainingDay2;

interface Atm1 {
	abstract void depo();
}

interface Atm2 {
	abstract void min();
}

public class Demo18 implements Atm1, Atm2 {
	public void depo() {
		System.out.println("dep");
	}

	public void min() {
		System.out.println("min");
	}

	public static void main(String[] args) {
		Demo18 v = new Demo18();
		v.min();
		v.depo();
	}
}

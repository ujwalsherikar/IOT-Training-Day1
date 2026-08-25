package TrainingDay2;

public class Demo12 {
	private static Demo12 az;

	public Demo12() {
		System.out.println("Hello world");
	}

	public Demo12(int a) {
		System.out.println("Hello world contr");
	}

	public static void main(String[] args) {
		setAz(new Demo12());
	}

	public static Demo12 getAz() {
		return az;
	}

	public static void setAz(Demo12 az) {
		Demo12.az = az;
	}
}
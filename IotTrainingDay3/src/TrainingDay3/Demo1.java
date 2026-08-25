package TrainingDay3;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Hello");

		try {
			int[] a= {10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
	
		} catch (Exception e) {
			System.out.println(" exception handle");
		}
		System.out.println("Hello sir");
	}
}
package TrainingDay3;
public class multithreading8 extends Thread {
    public void run() {
    	for (int i=0;i<5; i++) {
    	}
    }
    public static void main(String[] args) {
		multithreading8 bb = new multithreading8();
		bb.start();
		for(int i=0; i<5; i++) {
			System.out.println("main method" +i);
		}
	}
}

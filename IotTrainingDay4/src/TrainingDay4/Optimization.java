package TrainingDay4;

public class Optimization {
    public static void main(String[] args) {
        int n = 10000;
        int[] students = new int[n];
        int target = 1000;
        boolean found = false;
        students[999] = 1000;
        for (int i = 0; i < n; i++) {
            if (students[i] == target) {
                found = true;
                break;
            }
        }
        System.out.println("students found:" + found);
    }
}
	

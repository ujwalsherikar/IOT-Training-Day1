package TrainingDay4;

public class Marks {
    public static void main(String[] args) {
        int[] marks = {78, 65, 89, 92, 71};
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max)
                max = marks[i];
        }
        System.out.println("Highest Marks = " + max);
    }
}

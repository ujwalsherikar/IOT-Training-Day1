package TrainingDay4;
public class Modulo4 {
    public static void main(String[] args) {
        int[] salary = {1000, 15000, 12000, 18000, 20000};
        int total = 0;
        for (int i = 0; i < salary.length; i++) {
            total = total + salary[i];
        }
        System.out.println("Total Salary = " + total);
    }
}
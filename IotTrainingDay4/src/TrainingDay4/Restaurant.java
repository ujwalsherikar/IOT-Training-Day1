package TrainingDay4;
import java.util.Scanner;

class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Sandwich");
        System.out.println("5. Roti Bale");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: System.out.println("Pizza"); break;
            case 2: System.out.println("Burger"); break;
            case 3: System.out.println("Pasta"); break;
            case 4: System.out.println("Sandwich"); break;
            case 5: System.out.println("Roti Bale"); break;
            default: System.out.println("Invalid");
        }
    }
}
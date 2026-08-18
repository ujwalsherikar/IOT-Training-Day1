package ujwal;
public class factorial {
    void factorial() {
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
    }
   public static void main(String[] args) {
        factorial d = new factorial();
        d.factorial();
    }
}

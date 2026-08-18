package ujwal;

public class palindrome {

    void palindrome() {
        int n = 121;
        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        palindrome d = new palindrome();
        d.palindrome();
    }
}

package TrainingDay3;

class MyThread extends Thread {
    Bank11 bank;
    MyThread(Bank11 bank) {
        this.bank = bank;
    }
    public void run() {
        Bank11.withdraw(500);
    }
}
public class Bank11 {
    synchronized static void withdraw(int amount) {
        System.out.println("Withdrawing " + amount);
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Withdrawal completed");
    }
    public static void main(String[] args) {
        Bank11 bank = new Bank11();
        MyThread t1 = new MyThread(bank);
        MyThread t2 = new MyThread(bank);
        t1.start();
        t2.start();
    }
}
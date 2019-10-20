public class Panepinto_p2 {
    private static double annualInterestRate;
    private double savingsBalance;

    // Constructor.
    Panepinto_p2(double balance) {
        savingsBalance = balance;
    }

    public static double calculateMonthlyInterest(double balance) {
        return (balance * annualInterestRate) / 12.0;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double val) {
        savingsBalance = val;
    }

    public void modifyInterestRate(double newVal) {
        annualInterestRate = newVal;
    }

}

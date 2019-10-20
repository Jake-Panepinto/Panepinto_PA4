class SavingsAccountTest {

    @org.junit.jupiter.api.Test
    void Application() {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        saver1.modifyInterestRate(0.04);
        int i;

        System.out.println("        Saver1  Saver2");
        for(i=0; i<12; i++){
            saver1.setSavingsBalance(saver1.getSavingsBalance() +
                    SavingsAccount.calculateMonthlyInterest(saver1.getSavingsBalance()));
            saver2.setSavingsBalance(saver2.getSavingsBalance() +
                    SavingsAccount.calculateMonthlyInterest(saver2.getSavingsBalance()));
            System.out.printf("Month %d ", i+1);
            System.out.printf("%.2f ", saver1.getSavingsBalance());
            System.out.printf("%.2f%n", saver2.getSavingsBalance());
        }
        System.out.println("");

        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        saver1.modifyInterestRate(0.05);
        System.out.println("        Saver1  Saver2");
        for(i=0; i<12; i++){
            saver1.setSavingsBalance(saver1.getSavingsBalance() +
                    SavingsAccount.calculateMonthlyInterest(saver1.getSavingsBalance()));
            saver2.setSavingsBalance(saver2.getSavingsBalance() +
                    SavingsAccount.calculateMonthlyInterest(saver2.getSavingsBalance()));
            System.out.printf("Month %d ", i+1);
            System.out.printf("%.2f ", saver1.getSavingsBalance());
            System.out.printf("%.2f%n", saver2.getSavingsBalance());
        }
    }
}
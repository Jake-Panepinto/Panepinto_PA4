class Panepinto_p2Test {

    @org.junit.jupiter.api.Test
    void Application() {
        Panepinto_p2 saver1 = new Panepinto_p2(2000.00);
        Panepinto_p2 saver2 = new Panepinto_p2(3000.00);
        saver1.modifyInterestRate(0.04);
        int i;

        System.out.println("        Saver1  Saver2");
        for(i=0; i<12; i++){
            saver1.setSavingsBalance(saver1.getSavingsBalance() +
                    Panepinto_p2.calculateMonthlyInterest(saver1.getSavingsBalance()));
            saver2.setSavingsBalance(saver2.getSavingsBalance() +
                    Panepinto_p2.calculateMonthlyInterest(saver2.getSavingsBalance()));
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
                    Panepinto_p2.calculateMonthlyInterest(saver1.getSavingsBalance()));
            saver2.setSavingsBalance(saver2.getSavingsBalance() +
                    Panepinto_p2.calculateMonthlyInterest(saver2.getSavingsBalance()));
            System.out.printf("Month %d ", i+1);
            System.out.printf("%.2f ", saver1.getSavingsBalance());
            System.out.printf("%.2f%n", saver2.getSavingsBalance());
        }
    }
}
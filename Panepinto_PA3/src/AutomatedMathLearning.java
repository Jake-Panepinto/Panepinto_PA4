import java.security.SecureRandom;
import java.util.Scanner;

public class AutomatedMathLearning {

    // This method generates and asks the question and also
    // returns the answer to be used later.
    public static double promptQuestion(SecureRandom rand, int difficulty, int type) {

        int num1 = 0, num2 = 0;
        double ans = 0;
        switch (difficulty) {
            case 1:
                num1 = rand.nextInt(10);
                num2 = rand.nextInt(10);
                break;
            case 2:
                num1 = rand.nextInt(89) + 10;
                num2 = rand.nextInt(89) + 10;
                break;
            case 3:
                num1 = rand.nextInt(899) + 100;
                num2 = rand.nextInt(899) + 100;
                break;
            case 4:
                num1 = rand.nextInt(8999) + 1000;
                num2 = rand.nextInt(8999) + 1000;
                break;
        }

        switch (type) {
            case 1:
                System.out.println("How much is " + num1 + " plus " + num2 + "?");
                ans = (double) num1 + (double) num2;
                break;
            case 2:
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                ans = (double) num1 * (double) num2;
                break;
            case 3:
                System.out.println("How much is " + num1 + " minus " + num2 + "?");
                ans = (double) num1 - (double) num2;
                break;
            case 4:
                if (num2 == 0) num2++;
                System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                ans = (double) num1 / (double) num2;
                break;
        }

        return ans;
    }

    // This method returns true if the answer is correct and
    // false if it is incorrect.
    public static boolean checkCorrectness(double ans, Scanner in) {

        double userNum = in.nextDouble();
        return Math.abs((ans - userNum)) < 0.01;
    }

    // This method gives an appropriate response based on the
    // correctness of the response
    public static void response(boolean correctness, SecureRandom rand) {
        int num = rand.nextInt(4);
        if (correctness) {
            switch (num) {
                case 0:
                    System.out.println("Very good!");
                    break;
                case 1:
                    System.out.println("Excellent!");
                    break;
                case 2:
                    System.out.println("Nice work!");
                    break;
                case 3:
                    System.out.println("Keep up the good work!");
                    break;
            }
        } else {
            switch (num) {
                case 0:
                    System.out.println("No. Please try again.");
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 2:
                    System.out.println("Don't give up!");
                    break;
                case 3:
                    System.out.println("No. Keep trying.");
                    break;
            }
        }
    }

    // Prints percent correct as well as end message.
    public static void testResults(int numCorrect) {
        double percentage = ((double) numCorrect / 10.0) + 0.0000001;
        if (percentage >= 0.75) {
            System.out.printf("You got %.2f correct!%n", percentage);
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.printf("You got %.2f correct!%n", percentage);
            System.out.println("Please ask your teacher for extra help.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        int i, go = 1, numCorrect = 0, difficulty = 0, mathType = 0, type = 0;
        double ans;
        boolean correctness = false;

        while (go == 1) {

            numCorrect = 0;
            System.out.println("Enter a difficulty level (1-4)");
            difficulty = in.nextInt();
            System.out.println("Enter the type of math you want to practice.");
            System.out.println("Addition (1), Multiplication (2), Subtraction (3), Division (4), or All (5)");
            mathType = in.nextInt();
            type = mathType;

            for (i = 0; i < 10; i++) {

                if (mathType == 5) {
                    type = rand.nextInt(4) + 1;
                }

                correctness = false;
                ans = promptQuestion(rand, difficulty, type);
                correctness = checkCorrectness(ans, in);
                response(correctness, rand);
                if (correctness) numCorrect++;
            }
            testResults(numCorrect);
        }

    }
}

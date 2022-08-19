import java.util.Scanner;
public class vending_machine {
    private static int totalNotes = 0;
    private static int amount = 0;

    private static void printAmount(int maxAmt) {
        amount = amount - maxAmt;
        totalNotes++;
        System.out.print(maxAmt + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount");
        amount = scanner.nextInt();
        int maxAmt = 0;

        while (amount != 0) {
            if (amount >= 1000) {
                maxAmt = 1000;
            }else if (amount >= 500) {
                    maxAmt = 500;
                } else if (amount >= 100) {
                    maxAmt = 100;
            } else if (amount >= 50) {
                maxAmt = 50;
            } else if (amount >= 10) {
                maxAmt = 10;
            } else if (amount >= 5) {
                maxAmt = 5;
            } else if (amount >= 2) {
                maxAmt = 2;
            } else if (amount >= 1) {
                maxAmt = 1;
            }
            printAmount(maxAmt);
        }
        System.out.println("\nTotal notes : " + totalNotes);
    }
}

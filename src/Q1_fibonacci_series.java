import java.util.Scanner;
public class Q1_fibonacci_series {
    public static void main(String[] args) {
            int n, first = 0, next = 1;
            System.out.print("Enter a number");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            System.out.print("The first " + n + " Fibonacci numbers are: ");
            System.out.println(first + " " + next);
            for (
                    int i = 1;
                    i <= n - 2; ++i) {
                int sum = first + next;
                first = next;
                next = sum;
                System.out.print(" " + sum);
            }
        }
    }


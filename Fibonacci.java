import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, x = 0, y = 1, z;

        System.out.print("Enter the number of terms: ");
        number = input.nextInt();
        System.out.println("\nFibonacci Series: ");
        System.out.print(x + " " + y + " ");

        for (int i = 2; i < number; i++) {
            z = x + y;
            x = y;
            y = z;
            System.out.print(z + " ");
        }
        input.close();
    }
}


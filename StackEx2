import java.util.Scanner;

public class StackEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter desired stack size: ");
        int MAX = input.nextInt();
        int[] stack = new int[MAX];
        int top = -1;
        int choice, value;
        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your operation: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (top == MAX - 1) {
                        System.out.println("Stack Overflow");
                    } else {
                        System.out.print("Enter value to push: ");
                        value = input.nextInt();
                        stack[++top] = value;
                        System.out.println("Value pushed: " + value);
                    }
                    break;
                case 2:
                    if (top == -1) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println("Popped value: " + stack[top--]);
                    }
                    break;
                case 3:
                    if (top == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Top value: " + stack[top]);
                    }
                    break;
                case 4:
                    if (top == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.print("Stack elements: ");
                        for (int i = top; i >= 0; i--) {
                            System.out.print(stack[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (choice != 5);
        input.close();
    }
}

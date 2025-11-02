import java.util.*;

public class StackRealtime {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner input = new Scanner(System.in);
        int choice;
        int MAX = 5;
        do {
            clearScreen();
            System.out.println(stack);
            System.out.print("1. Push\n2. Pop\n3. Peek\n4. Exit\nChoose an option: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Push: ");
                    int value = input.nextInt();
                    if (stack.size() == MAX) {
                        System.out.print("Overflow");
                        input.nextLine();
                        input.nextLine();
                    } else 
                        stack.push(value);
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.print("Underflow");
                        input.nextLine();
                        input.nextLine();
                    } else
                        stack.pop();
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                        input.nextLine();
                        input.nextLine();
                    } else
                        stack.peek();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    break;
            }
        } while (choice != 4);
    }
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        }
        catch (Exception e) {
            System.out.println("Error clearing screen: " + e.getMessage());
        }
    }
}

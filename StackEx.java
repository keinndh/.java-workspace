import java.util.Stack;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner input = new Scanner(System.in);
        boolean running = true;
        int STACK_CAPACITY = 0;
        do {
            clearScreen();
            System.out.println("== Stacks ==\n");
            System.out.println("1. View Stack");
            System.out.println("2. Push");
            System.out.println("3. Pop");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Check Stack");
            System.out.println("7. Exit");
            System.out.print("\nPlease select an option: ");
            int choice = -1;
            try {
                choice = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid choice. Press Enter to try again.");
                input.nextLine();
                input.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.println("== Your Stack ==\n");
                    if (stack.isEmpty())
                        System.out.println("No stack objects found.");
                    else {
                        System.out.println("Stack: " + stack);
                        System.out.print("\nReversed stack (y/n)?: ");
                        char clear = input.nextLine().charAt(0);
                        if (clear == 'y') {
                            System.out.println("\nReversed Stack: " + stack.reversed());
                        } else
                            System.out.println("\nStack not reversed.");
                    }
                    System.out.print("\nPress Enter to return...");
                    input.nextLine();
                    break;
                case 2:
                    if (STACK_CAPACITY == 0) {
                        clearScreen();
                        System.out.println("== Stack Capacity ==\n");
                        System.out.print("Please enter the stack capacity: ");
                        try {
                            STACK_CAPACITY = input.nextInt();
                            input.nextLine();
                            if (STACK_CAPACITY <= 0) {
                                System.out.println("\nInvalid capacity. Press Enter to try again.");
                                STACK_CAPACITY = 0;
                                input.nextLine();
                                continue;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nInvalid capacity. Press Enter to try again.");
                            input.nextLine();
                            input.nextLine();
                            continue;
                        }
                        System.out.print("\nPress Enter to push objects...");
                        input.nextLine();
                    }
                    boolean runningSec = true;
                    int object;
                    do {
                        clearScreen();
                        System.out.println("== Push ==\n");
                        System.out.println("1. Push");
                        System.out.println("2. Push Specific");
                        System.out.println("3. Back");
                        System.out.print("\nPlease select an option: ");
                        try {
                            choice = input.nextInt();
                            input.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("\nInvalid choice. Press Enter to try again.");
                            input.nextLine();
                            input.nextLine();
                            continue;
                        }
                        switch (choice) {
                            case 1:
                                clearScreen();
                                System.out.println("== Push ==\n");
                                System.out.print("Please enter the number of object/s to push (Max of " + stack.capacity() + "): ");
                                int size = input.nextInt();
                                System.out.println();
                                for (int i = 0; i < size; i++) {
                                    System.out.print("Enter object: ");
                                    object = input.nextInt();
                                    if (stack.size() < STACK_CAPACITY) {
                                        stack.push(object);
                                    } else {
                                        System.out.println("Stack is full. Cannot push more objects.");
                                    }
                                }
                                System.out.print("\nPress Enter to continue...");
                                input.nextLine();
                                input.nextLine();
                                break;
                            case 2:
                                clearScreen();
                                System.out.println("== Push Specific ==\n");
                                if (stack.isEmpty())
                                    System.out.println("No stack objects found. Push object/s to stack first.");
                                else {
                                    System.out.println("Stack: " + stack);
                                    System.out.print("Please enter the index (1 - " + stack.size() + ") number of the object to push: ");
                                    int pushObject = input.nextInt();
                                    System.out.print("\nEnter object to push: ");
                                    int theObject = input.nextInt();
                                    if (pushObject > 0 && pushObject <= stack.size() + 1 && stack.size() < STACK_CAPACITY) {
                                        stack.add(pushObject - 1, theObject);
                                        System.out.println("\nObject pushed at index " + pushObject + ".");
                                        System.out.println("Stack after specific push: " + stack);
                                    } else {
                                        System.out.println("\nInvalid index. Please try again.");
                                    }
                                }
                                System.out.print("\nPress Enter to continue...");
                                input.nextLine();
                                break;
                            case 3:
                                runningSec = false;
                                break;
                            default:
                                System.out.println("\nInvalid choice. Press Enter to try again.");
                                input.nextLine();
                        }
                    } while (runningSec);
                    break;
                case 3:
                    boolean runningThrd = true;
                    do {
                        clearScreen();
                        System.out.println("== Pop ==\n");
                        System.out.println("1. Pop");
                        System.out.println("2. Pop Specific");
                        System.out.println("3. Back");
                        System.out.print("\nPlease select an option: ");
                        try {
                            choice = input.nextInt();
                            input.nextLine();
                        } catch (InputMismatchException e) {
                            System.out.println("\nInvalid choice. Press Enter to try again.");
                            input.nextLine();
                            input.nextLine();
                            continue;
                        }
                        switch (choice) {
                            case 1:
                                clearScreen();
                                System.out.println("== Pop ==\n");
                                char repeat = ' ';
                                do {
                                    clearScreen();
                                    System.out.println("== Pop ==\n");
                                    if (stack.isEmpty())
                                        System.out.println("No stack objects found. Push object/s to stack first.");
                                    else {
                                        System.out.println("Stack: " + stack);
                                        System.out.print("\nPop top (Last In) object (y/n)?: ");
                                        repeat = input.nextLine().charAt(0);
                                        if (repeat == 'y') {
                                            stack.pop();
                                            System.out.print("\nObject popped. Press Enter to repeat.\n");
                                            input.nextLine();
                                        } else
                                        break;
                                    }
                                } while (repeat == 'y');
                                System.out.print("\nPress Enter to return...");
                                input.nextLine();
                                break;
                            case 2:
                                clearScreen();
                                System.out.println("== Pop Specific ==\n");
                                if (stack.isEmpty())
                                    System.out.println("No stack objects found. Push object/s to stack first.");
                                else {
                                    do {
                                        clearScreen();
                                        System.out.println("== Pop Specific ==\n");
                                        System.out.println("Stack: " + stack);
                                        System.out.print("Please enter the index (1 - " + stack.size() + ") number of the object to pop: ");
                                        int popObject = input.nextInt();
                                        if (popObject > 0 && popObject <= stack.size()) {
                                            stack.remove(popObject - 1);
                                            System.out.println("\nObject at index " + popObject + " popped.");
                                            System.out.println("Stack after specific pop: " + stack);
                                            System.out.print("\nPop another specific object (y/n)?: ");
                                            char repeatPop = input.next().charAt(0);
                                            input.nextLine();
                                            if (repeatPop == 'n')
                                                break;
                                        } else {
                                            System.out.println("\nInvalid index. Please try again.");
                                        }
                                    } while (true);
                                }
                                System.out.print("\nPress Enter to continue...");
                                input.nextLine();
                                input.nextLine();
                                break;
                            case 3:
                                runningSec = false;
                                break;
                            default:
                                System.out.println("\nInvalid choice. Press Enter to try again.");
                                input.nextLine();
                        }
                    } while (runningThrd);
                    break;
                case 4:
                    clearScreen();
                    System.out.println("== Peek ==\n");
                    if (stack.isEmpty())
                        System.out.println("No stack objects found. Push object/s to stack first.");
                    else
                        System.out.println("Top (Last In) object: " + stack.peek());
                    System.out.print("\nPress Enter to return...");
                    input.nextLine();
                    break;
                case 5:
                    clearScreen();
                    System.out.println("== Clear Stack ==\n");
                    if (stack.empty() == true)
                        System.out.println("Stack Status: Empty");
                    else {
                        System.out.println("Stack: " + stack);
                        System.out.print("Clear stack (y/n)?: ");
                        char clear = input.nextLine().charAt(0);
                        if (clear == 'y') {
                            stack.clear();
                            System.out.println("\nStack cleared successfully.");
                        } else
                            System.out.println("\nStack not cleared.");
                    }
                    System.out.print("\nPress Enter to return...");
                    input.nextLine();
                    break;
                case 6:
                    clearScreen();
                    System.out.println("== Check Stack ==\n");
                    if (stack.empty() == true)
                        System.out.println("Stack Status: Empty");
                    else {
                        System.out.println("Stack Status: Not Empty");
                        System.out.println("Stack: " + stack);
                    }
                    System.out.print("\nPress Enter to return...");
                    input.nextLine();
                    break;
                case 7:
                    System.out.println("\nNow you have learned stacks.");
                    running = false;
                    break;
                default:
                    System.out.println("\nInvalid choice. Press Enter to try again.");
                    input.nextLine();
            }
        } while (running);
        input.close();
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

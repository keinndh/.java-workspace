import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;
        do {
            clearScreen();
            System.out.println("== Queue ==");
            System.out.println("\n1. View Queue");
            System.out.println("2. Enqueue");
            System.out.println("3. Dequeue");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Check Queue");
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
                    System.out.println("== Your Queue ==\n");
                    if (queue.isEmpty())
                        System.out.println("No queue objects found.");
                    else 
                        System.out.println("Queue: " + queue); // Display the queue
                    System.out.print("\nPress Enter to return...");
                    input.nextLine();
                    break;
                case 2:
                    clearScreen();
                    System.out.println("== Enqueue ==\n");
                    System.out.print("Please enter the number of object/s to enqueue: "); // Specify nnumber of objects to enqueue
                    int size = input.nextInt();
                    System.out.println();
                    for (int i = 0; i < size; i++) {
                        System.out.print("Enter object: ");
                        int object = input.nextInt();
                        queue.add(object); // Enqueue (add) objects to the queue
                    }
                    System.out.print("\nPress Enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;
                case 3:
                    char repeat = ' ';
                    do {
                        clearScreen();
                        System.out.println("== Dequeue ==\n");
                        if (queue.isEmpty()) {
                            System.out.println("No queue objects found. Enqueue object/s to the queue first.");
                            System.out.print("\nPress Enter to continue...");
                            input.nextLine();
                            break;
                        }
                        else {
                            System.out.println("Queue: " + queue);
                            System.out.print("\nQueue first (FIrst In) object (y/n)?: ");
                            repeat = input.nextLine().charAt(0);
                            if (repeat == 'y') {
                                queue.remove(); // Dequeue (remove) the head object from the queue
                                System.out.print("\nObject dequeued. Press Enter to repeat...");
                                input.nextLine();
                            } else
                                break;
                        }
                    } while (repeat == 'y');
                    System.out.print("\nPress Enter to return...");
                    input.nextLine();
                    break;
                case 4:
                    clearScreen();
                    System.out.println("== Peek ==\n");
                    if (queue.isEmpty())
                        System.out.println("No queue objects found. Enqueue object/s to the queue first.");
                    else
                        System.out.println("Head (First In) object: " + queue.peek()); // Peek (view) the head object from the queue
                    System.out.println("\nPress Enter to return...");
                    input.nextLine();
                    break;
                case 5:
                    clearScreen();
                    System.out.println("== Clear ==\n");
                    if (queue.isEmpty())
                        System.out.println("Queue is empty.");
                    else {
                        System.out.println("Queue " + queue);
                        System.out.print("\nClear the queue y/n()?: ");
                        char clear = input.next().charAt(0);
                        if (clear == 'y') {
                            queue.removeAll(queue); // Clear all obejcts from the queue
                            System.out.println("\nQueue was cleared successfully.");
                            input.nextLine();
                        }
                        else
                            System.out.println("\nClearing was not approved.");
                    }
                    System.out.print("\nPress Enter to return...");
                    input.nextLine();
                    break;
                case 6:
                    clearScreen();
                    System.out.println("== Check Queue ==\n");
                    if (queue.isEmpty())
                        System.out.println("Queue Status: Empty");
                    else {
                        System.out.println("Queue Status: Not Empty");
                        System.out.println("Queue: " + queue);
                    }
                    System.out.print("\nPress Enter to return...");
                    input.nextLine();
                    break;
                case 7:
                    System.out.print("\nNow you have learned queue.");
                    running = false;
                    break;
                default:
                    System.out.print("\nInvalid choice. Press Enter to try again.");
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
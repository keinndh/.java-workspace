import java.util.*;

public class QueueRealTime {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            clearScreen();
            System.out.println(queue);
            System.out.print("\n1. Enqueue\n2. Dequeue\n3. Exit\nChoose an option: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print(">>: ");
                    int value = input.nextInt();
                    queue.add(value);
                    break;
                case 2:
                    queue.poll();
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        } while (choice != 3);
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
import java.util.*;

public class StackExam {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number object to store in the stack (Push): ");
        int size = input.nextInt();
        System.out.println();
        for (int i = 0; i < size; i++ ) {
            System.out.print("Enter objects: ");
            int objects = input.nextInt();
            stack.push(objects);
        }
        System.out.println("\nStack: " + stack);
        System.out.println("Reversed stack: " + stack.reversed());
    }
    
}

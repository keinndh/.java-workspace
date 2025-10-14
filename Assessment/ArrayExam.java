import java.util.*;

public class ArrayExam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.print("Enter the number of elements to add (Max of 10) : ");
        int numberOfElements = input.nextInt();
        System.out.println();
        for (int i = 0; i < numberOfElements; i++ ) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int elements = input.nextInt();
            array.add(elements);
        }
        System.out.println("\nArray elements: " + array);
        System.out.println("\nAdding Elements");
        System.out.print("Enter the index choice: ");
        int index = input.nextInt();
        System.out.print("\nEnter the new element to add: ");
        int elementToAdd = input.nextInt();
        if (index >= 0 && index <= array.size() + 1 && array.size() < 10) {
            array.add(index, elementToAdd);
            System.out.print("\nArray elements after update: " + array);
        } else
            System.out.print("Invalid index.");
    }
}

import java.util.*;

public class Array1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1D ARRAY\n");
        System.out.print("Enter your desire array size (1-10): ");
        int size = input.nextInt();
        int[] integers = new int[size];

        System.out.print("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            integers[i] = input.nextInt();
        }

        System.out.print("\nArray (forward): ");
        for (int i = 0; i < size; i++) {
            System.out.print(integers[i] + " ");   
        }

        System.out.print("");   

        int reverse = size/2;
        for(int i = 0; i < reverse; i++) {
            int index = integers[i];
            integers[i] = integers[size-1-i];
            integers[size-1-i] = index;
        }

        System.out.print("\nArray (reverse): ");
        for (int i = 0; i < size; i++) {
            System.out.print(integers[i] + " "); 
        }
        
        int high = integers[0];
        int low = integers[0];
        double average = 0;
        double sum = 0;
        for (int i = 0; i < size; i++) {
            if (integers[i] > high)
                high = integers[i];
            if  (integers[i] < low)
                low = integers[i];
            sum += integers[i];
            average = sum/size;
        }

        System.out.print("\nMax: " + high + ", " + "Min: " + low + ", " + "Average: " + average) ;
    }   
}

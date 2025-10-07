import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] student = new int[5][3];
        
        System.out.println("2D ARRAY\n");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                student[i][j] = input.nextInt();
            }
        }

        System.out.print("\nGrade Table:");
        for (int i = 0; i < 5; i++) {
            System.out.print("\nS" + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(student[i][j] + " ");
            }
        }   
        System.out.println("");

        int high = student[0][0];
        double stud[] = {0, 0, 0, 0, 0};
        double subject[] = {0, 0, 0};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                stud[i] += student[i][j]/5;
            }
            for (int j = 0; j < 3; j++) {
                subject[j] += student[i][j]/3;
                if (student[i][j] > high)
                    high = student[i][j];
            }
        }

        System.out.println("\nAverage per Student: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("S" + (i + 1) + " = " + stud[i]);
            if (i < 4)
                System.out.print(", ");
        }
        System.out.println("");

        System.out.println("\nAverage per Subject: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Sub" + (i + 1) + " = " + subject[i]);
            if (i < 2)
                System.out.print(", ");
        }
        System.out.println("");

        System.out.println("\nHighest Grade: " + high);
    }
}

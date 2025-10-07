import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] student = new int[5][3];
        
        System.out.println("2D ARRAY\n");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i+1) + ": ");
            for (int j = 0; j < 3; j++) {
                student[i][j] = input.nextInt();
            }
        }
        
        System.out.print("\nGrade Table: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("\nS" + (i+1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(student[i][j] + " ");
            }
        }
        System.out.println();
        
        int max = student[0][0];
        double[] stud = new double[5];
        double[] subject = new double[3];
        
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += student[i][j];
                subject[j] += student[i][j];
                if (student[i][j] > max)
                    max = student[i][j];
            }
            stud[i] = sum / 3;
        }
        
        for (int j = 0; j < 3; j++) {
            subject[j] /= 5;
        }
        
        System.out.println("\nAverage per Student: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("S" + (i+1) + " = " + stud[i]);
        }
        
        System.out.println("\nAverage per Subject: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Sub" + (i+1) + " = " + subject[i]);
        }
        
        System.out.println("\nHighest Grade: " + max);
    }
}

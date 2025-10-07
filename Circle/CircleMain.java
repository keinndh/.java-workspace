import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Circle cir = new Circle();
        
        System.out.println("Enter the radius: ");
        int number = input.nextInt();
        
        cir.setRadius(number);
        
        System.out.println("\nRadius: " + cir.getRadius());
        System.out.println("Area: " + cir.getArea());
        System.out.println("Perimeter: " + cir.getPerimeter());
    }
}
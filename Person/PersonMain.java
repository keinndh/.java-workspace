
/**
 * Write a description of class PersonMain here.
 *
 * @author Abduljal Marajan
 * @version 1 (23 - 03 - 2025)
 */

import java.util.Scanner;

public class PersonMain {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Person class
        Person per = new Person();
        
        System.out.println("Please enter the details!");
        System.out.print("\nName: ");
        String name = input.nextLine();
        per.setName(name);
        
        System.out.print("Address: ");
        String address = input.nextLine();
        per.setAddress(address);
        
        // Student class
        Student stud = new Student();
        
        System.out.print("\nProgram: ");
        String program = input.nextLine();
        stud.setProgram(program);
        
        System.out.print("Year: ");
        int year = input.nextInt();
        stud.setYear(year);
        
        System.out.print("Fee: ");
        double fee = input.nextDouble();
        stud.setFee(fee);
        
        // Staff class
        Staff staf = new Staff();
        
        System.out.print("\nSchool: ");
        String school = input.nextLine();
        staf.setSchool(school);
        
        System.out.print("Fee: ");
        double pay = input.nextDouble();
        staf.setPay(pay);
        
        System.out.println(per.toString());
        System.out.println(stud.toString());
        System.out.println(staf.toString());
    
    }
}
    
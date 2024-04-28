package Lab12;

import java.util.Scanner;

public class Menu {
    StudentRecord studentRecord = new StudentRecord();
    Scanner input = new Scanner(System.in);

    public void displayMenu(){
        boolean inMenu = true;
        while(inMenu){
            System.out.print("""
                ******** Menu ********
                1. Create New Student
                2. Remove Student from Record
                3. View Student
                4. Display All Students
                5. Exit
                
                """);
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Student name: ");
                    String newName = input.nextLine();
                    System.out.print("GPA: ");
                    double gpa = Double.parseDouble(input.nextLine());
                    System.out.print("ID: ");
                    Integer id = Integer.parseInt(input.nextLine());
                    Student newStudent = new Student(newName, gpa, id);
                    studentRecord.addStudent(id,newStudent);
                    break;

                case 2:
                    System.out.print("Student ID: ");
                    Integer removalID = Integer.parseInt(input.nextLine());
                    studentRecord.removeStudent(removalID);
                    break;
                case 3:
                    System.out.print("Student ID: ");
                    Integer searchID = Integer.parseInt(input.nextLine());
                    System.out.println(studentRecord.getStudent(searchID));
                    break;
                case 4:
                    System.out.println(studentRecord.getAllStudents());
                    break;
                case 5:
                    inMenu = false;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}

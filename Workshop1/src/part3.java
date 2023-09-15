import java.util.ArrayList;
import java.util.Scanner;

public class Part3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        ArrayList<String> studentList = new ArrayList<>();
        
        // Add the names of the students to the list
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the name of student #" + (i+1) + ": ");
            String studentName = scanner.next();
            studentList.add(studentName);
        }
        
        // Convert all names to uppercase
        for (int i = 0; i < studentList.size(); i++) {
            String origName = studentList.get(i);
            String upperName = origName.toUpperCase();
            studentList.set(i, upperName);
        }
        
        // Print the updated list of student names
        System.out.println("Upper-cased student names:");
        for (String student : studentList) {
            System.out.println(student);
        }
    }
}

import java.util.Scanner;

 class StudentEX03 {
    public String firstName;
    public String lastName;
    public int grade;
    public String gender;
}

public class EX_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentEX03[] students = new StudentEX03[4];

        for (int i = 0; i < 4; i++) {
            students[i] = new StudentEX03();
            System.out.println("Enter first name:");
            students[i].firstName = scanner.nextLine();
            System.out.println("Enter last name:");
            students[i].lastName = scanner.nextLine();
            System.out.println("Enter grade :");
            students[i].grade = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter gender :");
            students[i].gender = scanner.nextLine();
        }
        for (int i = 0; i < students.length; i++) {

            System.out.println("Student No:"+i);
            System.out.println(students[i].firstName);
            System.out.println(students[i].lastName);
            System.out.println(students[i].grade);
            System.out.println(students[i].gender);
            System.out.println("---------------");


        }
    }
}



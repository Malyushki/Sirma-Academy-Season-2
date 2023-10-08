import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentEX051502{
    private String names;
    private int age;
    private double grade;
    private String gender;

    public StudentEX051502(String name, int age, double grade, String gender) {
        this.names = name;
        this.age = age;
        this.grade = grade;
        this.gender = gender;
    }
    public void showStudent(){
        System.out.printf("|Names: %s| |Age: %d| |Grade: %.2f| |Gender: %s|",this.names,this.age,this.grade,this.gender);
        System.out.println();
    }

    public String getNames() {
        return names;
    }
}

public class EX_05_15_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numberOfStudents = 1;
        System.out.printf("You have to enter information about %d students.%n", numberOfStudents);
        List<StudentEX051502> studentList = new ArrayList<>();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("|NEW STUDENT|");
            System.out.print("Names: ");
            String names = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Grade: ");
            double grade = Double.parseDouble(scanner.nextLine());
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            studentList.add(new StudentEX051502(names, age, grade, gender));

        }
       /* int counter = 1;
        for (StudentEX051502 student:studentList) {

            System.out.printf("%d. ",counter);
            student.showStudent();
            counter++;
        }

        */
        System.out.println("Enter names to search student: ");
        String namesToSearch = scanner.nextLine();
        boolean itExists = false;
        for (StudentEX051502 student : studentList) {
            if (student.getNames(). equals(namesToSearch)) {
                student.showStudent();
                itExists  = true;
            }
        }
        if (!itExists){
            System.out.println("Student doesn't exist in database!");
        }
    }
}

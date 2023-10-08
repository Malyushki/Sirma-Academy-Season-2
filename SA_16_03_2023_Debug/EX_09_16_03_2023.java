import java.util.ArrayList;

class Group {
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;

    Group() {
        students = new ArrayList<Student>();
        teachers = new ArrayList<Teacher>();
    }

    void addStudent(Student student) {   //should be student
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {  //should be public
        teachers.add(teacher);
    }

    public void display() {  //should be public and no need for argument inside boolean true
        System.out.println("Students:");
        for (Student student : students) {   //no need forEach
            System.out.println(student.getName() + " " + student.getSurname() + " " + student.getPhone());
        }
        System.out.println("\nTeachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName() + " " + teacher.getSurname() + " " + teacher.getPhone());
        }
    }
}

class Person {
    private String name;
    private String surname;
    private String phone;

    Person(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    String getName() {
        return name;
    }                               //no closing--> }

    String getSurname() {
        return surname;
    }

    String getPhone() {
        return phone;
    }
}

class Student extends Person {

    Student(String name, String surname, String phone) {
        super(name, surname, phone);
    }
}

class Teacher extends Person {  //should not be private
    Teacher(String name, String surname, String phone) {
        super(name, surname, phone);
    }
}

public class EX_09_16_03_2023 {
    public static void main(String[] args) {
        Group group = new Group();  //no need fo argument 3
        group.addStudent(new Student("John", "Doe", "123-456-7890"));
        group.addStudent(new Student("Jane", "Doe", "456-789-0123"));
        group.addTeacher(new Teacher("Mr.", "Smith", "789-012-3456"));
        group.addTeacher(new Teacher("Ms.", "Johnson", "321-654-9870"));
        group.display();
    }
}

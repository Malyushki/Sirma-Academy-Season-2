package EX_03_26_03_2023;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Pesho");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("SirmaAcademy_2023/SA_26_03_2023/EX_03_26_03_2023/files/student.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(student);
            outputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        FileOpenerClass fileOpenerClass = new FileOpenerClass();
        String content = fileOpenerClass.open("txt", "info.txt");
        System.out.println(content);

        String studentName = fileOpenerClass.open("ser", "student.ser");
        System.out.println(studentName);

    }
}

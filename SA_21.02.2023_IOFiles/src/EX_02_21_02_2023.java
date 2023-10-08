import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EX_02_21_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String userName = scanner.nextLine();
        System.out.println("Enter password:");
        String userPassword = scanner.nextLine();
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\FIles\\" + userName;
        File myFile = new File(path);
        try {
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile);
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fileWriter = new FileWriter(myFile);

            fileWriter.write(userPassword);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

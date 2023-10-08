import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class EX_01_21_02_2023 {
    public static void main(String[] args) {
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\FIles\\EX_01.txt";
        File myFile = new File(path);
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String userInput = scanner.nextLine();
        try {
            FileWriter fileWriter = new FileWriter(myFile);
            fileWriter.write(userInput);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

    }
}

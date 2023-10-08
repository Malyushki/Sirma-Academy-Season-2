import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Scanner;

public class EX_04_21_02_2023 {
    public static void main(String[] args) throws IOException {
        String fileNameToRead = "string_data.txt";
        String fileNameToBeReversed = "string_reverse.txt";
        String pathToReadFrom = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\FIles\\" + fileNameToRead;
        String pathToWrite = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\FIles\\" + fileNameToBeReversed;

        File stringReverse = new File(pathToWrite);
        if (stringReverse.createNewFile()) {
            System.out.println("File created: " + stringReverse);
        } else {
            System.out.println("File already exists");
        }

        try {
            FileReader reader = new FileReader(pathToReadFrom);
            Scanner myReader = new Scanner(reader);
            FileWriter myWriter = new FileWriter(pathToWrite);
            ArrayDeque<String> textStack = new ArrayDeque<>();

            while (myReader.hasNextLine()) {
                textStack.push(myReader.nextLine());
            }
            while (!textStack.isEmpty()) {
                myWriter.write(textStack.pop());
                myWriter.write(System.lineSeparator());
            }
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

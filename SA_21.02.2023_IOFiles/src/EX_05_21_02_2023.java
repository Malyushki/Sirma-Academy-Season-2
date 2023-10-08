import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Scanner;

public class EX_05_21_02_2023 {
    public static void main(String[] args) throws IOException {
        String fileNameToRead = "int_data.txt";
        String fileNameToWrite = "doubled_ints.txt";
        String pathToReadFrom = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\Files\\" + fileNameToRead;
        String pathToWrite = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\Files\\" + fileNameToWrite;
        File fileToReadFrom = new File(pathToReadFrom);
        Scanner fileScanner = new Scanner(fileToReadFrom);
        ArrayDeque<String> doubledNumbersQueue = new ArrayDeque<>();
        while (fileScanner.hasNextLine()) {
            int number = Integer.parseInt(fileScanner.nextLine());

            doubledNumbersQueue.offer(String.valueOf(number*2) + System.lineSeparator());

        }
        FileWriter writer = new FileWriter(pathToWrite);
        while (!doubledNumbersQueue.isEmpty()) {
            writer.write(doubledNumbersQueue.poll());

        }
        writer.close();
    }
}

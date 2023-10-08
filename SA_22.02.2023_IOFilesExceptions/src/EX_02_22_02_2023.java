import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.Scanner;


public class EX_02_22_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_22.02.2023_IOFilesExceptions\\Files\\";
        String dirOneName = "EX2";
        String[] fileNames = {"Names.txt", "IDs.txt"};
        ArrayDeque<String> namesQueue = new ArrayDeque<>();
        ArrayDeque<String> idQueue = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            namesQueue.offer(String.format("%s %s", input[0], input[1]));
            idQueue.offer(input[2]);
        }


        try {
            File newDir1 = new File(path + dirOneName);
            makeDirectory(newDir1);

            File fileName = new File(path + dirOneName + "\\" + fileNames[0]);
            File fileId = new File(path + dirOneName + "\\" + fileNames[1]);
            makeFile(fileName);
            makeFile(fileId);

            FileWriter writer = new FileWriter(fileName);

            while (!namesQueue.isEmpty()) {
                writer.write(namesQueue.poll() + System.lineSeparator());
            }
            writer.close();
            writer = new FileWriter(fileId);
            while (!idQueue.isEmpty()) {
                writer.write(idQueue.poll() + System.lineSeparator());
            }
            writer.close();

        } catch (Exception e) {
            throw new RuntimeException(e);


        }


    }

    private static void makeFile(File newFileInDir1) throws IOException {
        if (!newFileInDir1.exists()) {
            newFileInDir1.createNewFile();
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }
    }

    private static void makeDirectory(File newDir1) {
        if (!newDir1.exists()) {
            newDir1.mkdir();
            System.out.println("Directory created");
        } else {
            System.out.println("Directory already exists");
        }
    }
}

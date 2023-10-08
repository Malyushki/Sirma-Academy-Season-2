import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;


public class EX_07_22_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_22.02.2023_IOFilesExceptions\\Files\\";
        String dirOneName = "EX7";
        String fileName = "EX7.txt";


        try {
            File dir = new File(path + dirOneName);
            makeDirectory(dir);
            File file = new File(path + dirOneName + "\\" + fileName);
            makeFile(file);
            FileWriter writer = new FileWriter(file,true);

            System.out.println("Enter text or  empty to quit");


            String input = scanner.nextLine();
            while (!input.equals("")) {

                writer.write(input+ " TIME "+ Time.valueOf(LocalTime.now()) + System.lineSeparator());
                input = scanner.nextLine();
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

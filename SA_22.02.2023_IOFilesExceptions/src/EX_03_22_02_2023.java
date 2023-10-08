import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Scanner;


public class EX_03_22_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_22.02.2023_IOFilesExceptions\\Files\\";
        String dirOneName = "EX3";
        String fileName = "info.txt";


        try {
            File dir = new File(path + dirOneName);
            makeDirectory(dir);
            File file = new File(path + dirOneName + "\\" + fileName);
            makeFile(file);
            FileWriter writer = new FileWriter(file);

            for (int i = 1; i < 100; i++) {
                writer.write(i + ", ");
            }
            writer.write("100");
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

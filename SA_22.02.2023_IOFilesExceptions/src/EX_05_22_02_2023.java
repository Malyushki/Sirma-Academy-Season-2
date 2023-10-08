import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Scanner;


public class EX_05_22_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_22.02.2023_IOFilesExceptions\\Files\\";
        String dirOneName = "installEX5";
        String fileName = null;
        String pathToGetInfoFrom = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_22.02.2023_IOFilesExceptions\\Files\\info\\copyright.txt";

        try {
            File mDir = new File(path + dirOneName);
            makeDirectory(mDir);


            File fileToGetInfoFrom = new File(pathToGetInfoFrom);
            Scanner fileReader = new Scanner(fileToGetInfoFrom);
            ArrayDeque<String> textFromFileReaderQueue = new ArrayDeque<>();

            while (fileReader.hasNextLine()) {
                textFromFileReaderQueue.offer(fileReader.nextLine());
            }
            fileReader.close();
            while (!textFromFileReaderQueue.isEmpty()) {
                fileName = textFromFileReaderQueue.poll();
                File fileToCreate = new File(path + dirOneName + "\\" + fileName + ".txt");
                makeFile(fileToCreate);
            }
            double result = mDir.length()*1.00/1024;
            System.out.println("Size of your directory is: "+result +"MB");


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

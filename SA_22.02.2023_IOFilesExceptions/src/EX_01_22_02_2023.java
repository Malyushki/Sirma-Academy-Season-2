import java.io.File;
import java.io.IOException;

public class EX_01_22_02_2023 {
    public static void main(String[] args) {
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_22.02.2023_IOFilesExceptions\\Files\\";
        String dirOneName = "config";
        String dirTwoName = "info";
        String[] fileNames = {"configure.txt", "settings.txt", "readme.txt", "copyright.txt"};
        try {
            File newDir1 = new File(path + dirOneName);
            File newDir2 = new File(path + dirTwoName);
            makeDirectory(newDir1);
            for (int i = 0; i < 2; i++) {
                File newFileInDir1 = new File(path + dirOneName+"\\"+fileNames[i]);
                makeFile(newFileInDir1);
            }

            makeDirectory(newDir2);
            for (int i = 2; i < 4; i++) {
                File newFileInDir1 = new File(path +  dirTwoName+"\\"+fileNames[i]);
                makeFile(newFileInDir1);

            }

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

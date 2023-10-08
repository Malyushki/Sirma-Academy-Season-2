import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX_03_25_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter artist");
        String filePath = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SA_24.02.2023_RegularExpressions\\Files\\Catalog_EX3";
        File catalogue = new File(filePath);
        try {

            Scanner s1 = new Scanner(catalogue);
            Scanner s2 = new Scanner(System.in);
            Pattern pattern1 = Pattern.compile(s2.nextLine());
            boolean isthere=false;

            while (s1.hasNext()){

                Matcher matcher = pattern1.matcher(s1.nextLine());
                if (matcher.find()){
                    isthere=true;
                    break;
                }
            }
            if (isthere){
                System.out.println("Artist is in catalogue");
            }
            else{
                System.out.println("Artist is not in catalogue");

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}


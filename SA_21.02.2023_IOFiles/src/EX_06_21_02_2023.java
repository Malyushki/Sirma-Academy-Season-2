import java.io.*;

public class EX_06_21_02_2023 {
    public static void main(String[] args) {
        FractionEX_06_21_02_2023 fraction = new FractionEX_06_21_02_2023(5, 3);

        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\Files\\";
        String fileName = "FractionEX_06_21_02_2023.ser";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path + fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(fraction);
            out.close();
            fileOutputStream.close();
            System.out.printf("Serialized data is saved in "+fileName);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

class FractionEX_06_21_02_2023 implements Serializable {
    int enumerator;
    int denominator;

    public FractionEX_06_21_02_2023(int enumerator, int denominator) {
        this.enumerator = enumerator;
        this.denominator = denominator;
    }

    public void print() {
        System.out.println(this.enumerator);
        System.out.println(this.denominator);
    }
}


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EX_10_21_02_2023 {
    public static void main(String[] args) {
        FractionEX_06_21_02_2023 printFraction = null;
        DeliveryEX_07_21_02_2023 printDelivery = null;
        ShipEX_08_21_02_2023 printShip = null;
        UserEX_09_21_02_2023 printUser = null;
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\Files\\";
        String fileNameFraction = "FractionEX_06_21_02_2023.ser";
        String fileNameDelivery = "DeliveryEX_07_21_02_2023.ser";
        String fileNameShip  = "ShipEX_08_21_02_2023.ser";
        String fileNameUser = "UserEX_09_21_02_2023.ser";

        try {
            FileInputStream fileInputStream = new FileInputStream(path + fileNameFraction);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            FractionEX_06_21_02_2023 toPrintFraction = (FractionEX_06_21_02_2023) in.readObject();
            toPrintFraction.print();

            System.out.println("------------------");

            fileInputStream = new FileInputStream(path + fileNameDelivery);
            in = new ObjectInputStream(fileInputStream);
            DeliveryEX_07_21_02_2023 toPrintDelivery = (DeliveryEX_07_21_02_2023) in.readObject();
            toPrintDelivery.print();
            System.out.println("------------------");
            fileInputStream = new FileInputStream(path + fileNameShip);
            in = new ObjectInputStream(fileInputStream);
            ShipEX_08_21_02_2023 toPrintShip = (ShipEX_08_21_02_2023) in.readObject();
            toPrintShip.print();
            System.out.println("------------------");
            fileInputStream = new FileInputStream(path + fileNameUser);
            in = new ObjectInputStream(fileInputStream);
            UserEX_09_21_02_2023 toPrintUser = (UserEX_09_21_02_2023) in.readObject();
            toPrintUser.print();

            System.out.println("------------------");

            in.close();
            fileInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

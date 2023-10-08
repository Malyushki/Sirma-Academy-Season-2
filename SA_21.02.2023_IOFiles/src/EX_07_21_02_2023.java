import java.io.*;

public class EX_07_21_02_2023 {
    public static void main(String[] args) {
        DeliveryEX_07_21_02_2023 delivery = new DeliveryEX_07_21_02_2023(55.2, 158.15, true);
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\Files\\";
        String fileName = "DeliveryEX_07_21_02_2023.ser";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path + fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(delivery);
            out.close();
            fileOutputStream.close();
            System.out.printf("Serialized data is saved in " + fileName +System.lineSeparator());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(path + fileName);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            DeliveryEX_07_21_02_2023 newDelivery = (DeliveryEX_07_21_02_2023) in.readObject();

            in.close();
            fileInputStream.close();
            newDelivery.print();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

class DeliveryEX_07_21_02_2023 implements Serializable {
    double packageWeight;
    double packagePrice;
    boolean isUrgent;

    public DeliveryEX_07_21_02_2023(double packageWeight, double packagePrice, boolean isUrgent) {
        this.packageWeight = packageWeight;
        this.packagePrice = packagePrice;
        this.isUrgent = isUrgent;
    }

    public void print() {
        System.out.println(this.packageWeight);
        System.out.println(this.packagePrice);
        System.out.println(this.isUrgent);

    }
}
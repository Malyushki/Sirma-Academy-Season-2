import java.io.*;

public class EX_08_21_02_2023 {
    public static void main(String[] args) {
        ShipEX_08_21_02_2023 ship = new ShipEX_08_21_02_2023("Battleship",5000,20,"Weapons","Imperials");
        String path = "C:\\Users\\malyu\\Desktop\\SIRMA 2023\\java-pavlin-malyushki\\SirmaAcademy_2023\\SA_21.02.2023_IOFiles\\Files\\";
        String fileName = "ShipEX_08_21_02_2023.ser";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path + fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(ship);
            out.close();
            fileOutputStream.close();
            System.out.printf("Serialized data is saved in " + fileName +System.lineSeparator());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(path + fileName);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            ShipEX_08_21_02_2023 shipReceiveInfo = (ShipEX_08_21_02_2023) in.readObject();

            in.close();
            fileInputStream.close();
            shipReceiveInfo.print();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

class ShipEX_08_21_02_2023 implements Serializable {
    String type;
    double weight;
    double length;
    String cargoType;
    String companyName;

    public ShipEX_08_21_02_2023(String type, double weight, double length, String cargoType, String companyName) {
        this.type = type;
        this.weight = weight;
        this.length = length;
        this.cargoType = cargoType;
        this.companyName = companyName;
    }
    public void print(){
        System.out.println(this.type);
        System.out.println(this.weight);
        System.out.println(this.length);
        System.out.println(this.cargoType);
        System.out.println(this.companyName);



    }
}
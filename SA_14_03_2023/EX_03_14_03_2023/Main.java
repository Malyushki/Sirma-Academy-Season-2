package EX_03_14_03_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String companyName, double volume, String shipName)
        String companyName = "Evergreen 2.0";
        double volume = 5000.0;
        String shipName = "Canal Stopper";

        CargoShip cargoShip = new CargoShip(companyName,volume,shipName);

         companyName = "Travel Co";
         volume = 500;
         shipName = "Voyager";


        PassangerShip passangerShip = new PassangerShip(companyName,volume,shipName);

        cargoShip.show();
        System.out.println("-----------");
        passangerShip.show();

    }
}

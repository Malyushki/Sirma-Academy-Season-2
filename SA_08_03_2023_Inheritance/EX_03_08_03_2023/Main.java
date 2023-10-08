package EX_03_08_03_2023;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Planet> planetList = new ArrayList<>();
        planetList.add(new Earth());
        planetList.add(new Jupiter());
        planetList.add(new Mars());
        planetList.add(new Mercury());
        planetList.add(new Neptune());
        planetList.add(new Saturn());
        planetList.add(new Uranus());
        planetList.add(new Venus());


        for (Planet planet:planetList) {
            planet.printInfo();
            System.out.println("--------------");
        }
    }
}

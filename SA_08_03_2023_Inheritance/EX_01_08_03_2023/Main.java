package EX_01_08_03_2023;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Atom> atomsList = new ArrayList<>();

        atomsList.add(new Beryllium()) ;
        atomsList.add( new Cesium());
        atomsList.add(new Francium());
        atomsList.add(new Hydrogen());
        atomsList.add(new Lithium());
        atomsList.add(new Magnesium());
        atomsList.add(new Potassium());
        atomsList.add(new Radium());
        atomsList.add(new Rubidium());
        atomsList.add(new Sodium());

        int count = 1;

        for (Atom a:atomsList) {
            System.out.printf("%d. %s%n",count,a);
            count++;
        }
    }
}

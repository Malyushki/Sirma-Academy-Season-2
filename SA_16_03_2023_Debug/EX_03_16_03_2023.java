import java.util.ArrayList;

class City {  //can't be final

    private String name;   // could be private
    private int population; // could be private

    public City(String name, int population) {
        this.name = name;
        this.population = population;  //грешен аргумент
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}

class CapitalCity extends City {
    public CapitalCity(String name, int population) {
        super(name, population);
    }
}      //no close }

class SeasideCity extends City {
    public SeasideCity(String name, int population) {
        super(name, population);
    }
}

public class EX_03_16_03_2023 {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<City>();  //no Type of List
        cities.add(new CapitalCity("London", 8982000));   //no arguments and no ;
        cities.add(new CapitalCity("Sofia", 1300000));
        cities.add(new SeasideCity("Varna", 330000));
        cities.add(new SeasideCity("Burgas", 200000));
        cities.add(new City("Plovdiv", 350000));
        cities.add(new City("Ruse", 150000));

        for (City city : cities) {
            System.out.println(city.getName() + " - Population: " + city.getPopulation());
        }
    }
}
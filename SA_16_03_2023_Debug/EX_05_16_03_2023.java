import java.util.ArrayList;

class Continent {
    private ArrayList<Country> countries;   //missing private statement

    Continent() {
        countries = new ArrayList<Country>();
    }

    public void addCountry(Country country) {   //missing public statement
        this.countries.add(country);   //missing add argument
    }

    public void display() {   //missing public statement
        System.out.println("Countries:");
        for (Country country : countries) {
            System.out.println(country.getName() + " - " + country.getCapital() + " - " + country.getPopulation());
        }
    }
}

class Country extends Continent {
    private String name;
    private String capital;
    private int population;

    Country(String name, String capital, int population) {
        this.name = name;   // no name argument assignment
        this.capital = capital;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }
}

public class EX_05_16_03_2023 {
    public static void main(String[] args) {   //no main method call


        Continent continent = new Continent();

        continent.addCountry(new Country("Canada", "Ottawa", 38000000));  //no initialisation by using keyword new
        continent.addCountry(new Country("Mexico", "Mexico City", 126200000));
        continent.addCountry(new Country("Brazil", "Brasilia", 209500000));
        continent.addCountry(new Country("Argentina", "Buenos Aires", 44000000));
        continent.display();
    }
}
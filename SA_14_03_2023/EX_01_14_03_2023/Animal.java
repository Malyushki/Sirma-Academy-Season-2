package EX_01_14_03_2023;

public class Animal {
     String classAnimal;
     String species;

    public Animal(String classAnimal, String species) {
        this.classAnimal = classAnimal;
        this.species = species;
    }

    public void show() {
        System.out.println("This animal is of class " + this.classAnimal + " and it is a " + this.species);


    }
}

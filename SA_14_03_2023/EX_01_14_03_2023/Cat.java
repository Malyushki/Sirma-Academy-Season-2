package EX_01_14_03_2023;

public class Cat extends Animal {
     String breed;


    public Cat(String breed) {
        super("Mammal", "Cat");
        this.breed = breed;
    }

    @Override
    public void show() {
        System.out.println("The cat is a "+this.classAnimal+". This cat is a "+this.breed);
    }
}

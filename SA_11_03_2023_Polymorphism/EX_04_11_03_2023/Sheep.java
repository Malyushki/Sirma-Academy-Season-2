package EX_04_11_03_2023;

public class Sheep extends Animal{
    public Sheep(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bee");
    }
}

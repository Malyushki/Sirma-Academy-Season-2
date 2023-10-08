package EX_04_11_03_2023;

public class Rooster extends Animal{
    public Rooster(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }
}

package EX_04_11_03_2023;

public class Horse extends Animal{
    public Horse(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Phhh");
    }
}

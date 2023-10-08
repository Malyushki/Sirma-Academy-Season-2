package EX_04_11_03_2023;

public class Duck extends Animal{
    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
}

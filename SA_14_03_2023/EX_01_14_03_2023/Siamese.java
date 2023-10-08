package EX_01_14_03_2023;

public class Siamese extends Cat{
    public int age;
    public String name;

    public Siamese(int age, String name) {
        super("Siamese");
        this.age = age;
        this.name = name;

    }

    @Override
    public void show() {
        System.out.println("The cat "+this.name+" is a "+this.breed+", it is "+this.age+" years old.");
    }
}

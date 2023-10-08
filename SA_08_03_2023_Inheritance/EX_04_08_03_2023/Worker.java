package EX_04_08_03_2023;

public class Worker {
    public String name;
    public double salary;
    public double experience;

    public Worker(String name, double salary, double experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + getClass().getSimpleName());
        System.out.printf("Salary: %.2f USD%n", this.salary);
        System.out.printf("Experience: %.0f years%n", this.experience);

    }
}

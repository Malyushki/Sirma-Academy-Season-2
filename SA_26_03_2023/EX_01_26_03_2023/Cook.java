package EX_01_26_03_2023;

public class Cook implements Employee{
     String name;
     String position;

    public Cook(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this.name + " " + this.position);
    }
}

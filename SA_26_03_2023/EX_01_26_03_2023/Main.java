package EX_01_26_03_2023;

public class Main {
    public static void main(String[] args) {
        Cook dev1 = new Cook("David", "Cook");
        Cook dev2 = new Cook("Alex", "Cookr");

        Chef man1 = new Chef("John", "Chef");
        man1.addEmployee(dev1);
        man1.addEmployee(dev2);

        Cook dev3 = new Cook("Mark", "Cook");
        Chef man2 = new Chef("Mike", "Chef");
        man2.addEmployee(dev3);
        man2.addEmployee(man1);

        man2.showEmployeeDetails();
    }
}

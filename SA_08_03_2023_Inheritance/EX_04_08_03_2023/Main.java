package EX_04_08_03_2023;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Worker> workerList = new ArrayList<>();

        workerList.add(new Cleaner("Vlichka Stefanova", 1000, 2));
        workerList.add(new Cleaner("Stefania Stefanova", 1100, 5));
        workerList.add(new Accountant("Nikolay Nikolos", 1300, 6));
        workerList.add(new Accountant("Nadejda Stefano", 2000, 10));
        workerList.add(new Manager("Ivan Ivanov", 3000, 5));
        workerList.add(new Manager("Nikolay Ivanov", 3000, 5));
        workerList.add(new Programmer("Gergana Ivanova", 2500, 5));
        workerList.add(new Programmer("Sofka Povka", 2200, 5));
        workerList.add(new PR("Cener Adam", 1800, 5));
        workerList.add(new PR("Tom Cat", 1800, 5));


        for (Worker w :workerList) {
            w.printInfo();
            System.out.println("----------------------------------------------");
        }


    }
}

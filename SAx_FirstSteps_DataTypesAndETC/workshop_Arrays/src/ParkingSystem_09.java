import java.util.Scanner;

public class ParkingSystem_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dimensions = scanner.nextLine();
        int rows= Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols= Integer.parseInt(dimensions.split("\\s+")[1]);
        String[][] parkingLot = new String[rows][cols];
        String carInput = scanner.nextLine();
        while (!carInput.equals("stop")){
          String[] commandParts = carInput.split("\\s+");
          int entryRow = Integer.parseInt(commandParts[0]);
          int entryCol = 0;
          int desiredRow = Integer.parseInt(commandParts[1]);
          int desiredCol = Integer.parseInt(commandParts[2]);




            carInput = scanner.nextLine();
        }

    }
}

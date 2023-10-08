import java.util.Scanner;

public class GameMenu {

    public static void MainMenu() {
        System.out.println("Hello, lets play a game of Royal Capture");
        System.out.println("Please enter to continue");
        System.out.println("[S]tart , [R]ules, [E]xit");
        try {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine().toLowerCase();
            switch (command) {
                case "s":
                    Engine.gameRun();
                    break;
                case "r":
                    GameRulesPrint();
                    MainMenu();
                    break;
                case "e":
                    System.out.println("Thank you for playing");
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            MainMenu();
        }


    }

public static void GameRulesPrint(){
    System.out.println("""
            It is played with 16 cards - ace, king, queen, and jack from each suit.
            Each player starts with 5 random cards. Players take turns to play a card.
            The player who plays the card with the higher suit takes the trick. If the
            cards have the same suit, the higher card wins. The winning player takes both cards.
            The computer player always plays first. After five turns, the players count their points
            according to the following scheme:

            For each card, the points are the rank of the suit multiplied by the rank of the card.
            The ranks of the suits are:
            Clubs - 1
            Diamonds - 2
            Hearts - 3
            Spades - 4
            The ranks of the cards are:
            Ace - 11
            King - 10
            Queen - 9
            Jack - 8.""");

}
}

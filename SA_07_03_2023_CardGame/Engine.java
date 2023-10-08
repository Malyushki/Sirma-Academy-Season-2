import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void gameRun(){
        Scanner scanner = new Scanner(System.in);
        Deck pool = Deck.generateFullDeck();
        Deck aIDeck = pool.drawFive();
        Deck aIDeckFinish = new Deck();
        Deck playerDeck = pool.drawFive();
        Deck playerFinish = new Deck();

        boolean resultOfHand = true;

        for (int i = 0; i < 5; i++) {
            Card aICard;
            Card playerCard;

            if (resultOfHand) {
                System.out.println("|Computer goes first|");
                aICard = getAICard(aIDeck);
                playerCard = getPlayerCard(scanner, playerDeck);
            } else {
                System.out.println("|You go first|");
                playerCard = getPlayerCard(scanner, playerDeck);
                aICard = getAICardSecond(aIDeck, playerCard);
            }

            resultOfHand = Deck.compare(aICard, playerCard);
            if (resultOfHand) {
                System.out.println("Computer wins this hand");
                aIDeckFinish.addCard(aICard);
                aIDeckFinish.addCard(playerCard);

            } else {
                System.out.println("You win this hand");
                playerFinish.addCard(aICard);
                playerFinish.addCard(playerCard);

            }


        }
        System.out.println("Computer points:" + Deck.sum(aIDeckFinish));
        System.out.println("Player points:" + Deck.sum(playerFinish));
        System.out.println(Deck.sum(aIDeckFinish) > Deck.sum(playerFinish) ? "Computer wins" : "You win");
        if (continueGame()){
            GameMenu.MainMenu();
        }else {
            System.out.println("Thank you for playing");
        }

    }

    private static Card getAICard(Deck aIDeck) {
        Random random = new Random();
        Card aICard = aIDeck.draw(random.nextInt(aIDeck.getDeck().size()));
        System.out.println("Computer plays " + aICard);
        return aICard;
    }

    private static Card getAICardSecond(Deck aIDeck, Card playerCard) {

        for (Card card : aIDeck.getDeck()) {
            if (card.getValue() > playerCard.getValue())
                System.out.println("Computer plays " + card);
            return card;
        }

        return getAICard(aIDeck);
    }

    private static Card getPlayerCard(Scanner scanner, Deck playerDeck) {
        System.out.println("------Your deck---------");
        playerDeck.printDeck();
        System.out.println("------------------------");
        System.out.println("Chose card. You have " + playerDeck.getDeck().size() + " cards");
        int indexOfCard = 0;
        try {
            indexOfCard = Integer.parseInt(scanner.nextLine()) - 1;
            if (indexOfCard >= playerDeck.getDeck().size()) {
                System.out.println("Wrong index you will trow first card");
                indexOfCard = 0;
            }
        } catch (Exception e) {
            System.out.println("Wrong index you will trow first card");

        }
        Card playerCard = playerDeck.draw(indexOfCard);
        System.out.println("You played " + playerCard);
        return playerCard;
    }

    private static boolean continueGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want another game? Enter [y]...");
        try {
            String command = scanner.nextLine().toLowerCase();
            return command.equals("y");
        } catch (Exception e) {
            return false;
        }

    }


}

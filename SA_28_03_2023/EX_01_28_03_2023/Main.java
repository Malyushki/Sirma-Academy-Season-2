package EX_01_28_03_2023;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewChannel newChannel1 = new NewChannel();
        NewChannel newChannel2 = new NewChannel();

        newsAgency.registerObserver(newChannel1);
        newsAgency.registerObserver(newChannel2);

        newsAgency.setNews("Elections are coming!");

        newsAgency.removeObserver(newChannel2);

        newsAgency.setNews("The weather!");


    }
}

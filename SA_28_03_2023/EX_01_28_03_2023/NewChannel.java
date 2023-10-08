package EX_01_28_03_2023;

public class NewChannel implements Observer {
    String news;

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("New news:" + news);
    }
}

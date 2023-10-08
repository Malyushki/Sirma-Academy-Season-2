import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class BookEX051502 {
    private String author;
    private String title;
    private int year;

    public BookEX051502(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public void printInfo(){
        System.out.printf("|Author: %s| |Book: %s| |Year: %d|",this.author,this.title,this.year);
        System.out.println();
    }


}

public class EX_06_15_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int numberOfBooks = 10;
        System.out.printf("You have to enter information about %d books.%n", numberOfBooks);
        List<BookStackEX051502> bookList = new ArrayList<>();
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("|NEW BOOK|");
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Year: ");
            int year = Integer.parseInt(scanner.nextLine());


            bookList.add(new BookStackEX051502(author,title,year));

        }
      int counter = 1;
        for (BookStackEX051502 book:bookList) {

            System.out.printf("%d. ",counter);
            book.printInfo();
            counter++;
        }





    }
}

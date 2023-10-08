import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class BookStackEX051502 {
    private String author;
    private String title;
    private int year;

    public BookStackEX051502(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public void printInfo(){
        System.out.printf("|Author: %s| |Book: %s| |Year: %d|",this.author,this.title,this.year);
        System.out.println();
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}

public class EX_STACK_06_15_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int numberOfBooks = 3;
        System.out.printf("You have to enter information about %d books.%n", numberOfBooks);
        ArrayDeque<BookStackEX051502> bookStack = new ArrayDeque<>();
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("|NEW BOOK|");
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Year: ");
            int year = Integer.parseInt(scanner.nextLine());
            bookStack.push(new BookStackEX051502(author,title,year));
        }
     printReversedStack(bookStack);

    }
    public static void printReversedStack( ArrayDeque<BookStackEX051502> stack){
        ArrayDeque<BookStackEX051502> reverseStack = new ArrayDeque<>();

        while (!stack.isEmpty()){
            reverseStack.push(stack.pop());
        }
        int counter = 1;
        for (BookStackEX051502 book:reverseStack) {

            System.out.printf("%d. ",counter);
            book.printInfo();
            counter++;
        }
    }
}

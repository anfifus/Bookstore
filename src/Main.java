import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String title =askTitleBook();
        int numPages = askNumberPagesBook();
        Book book = new Book(title,numPages);

        showBook(book);
    }

    private static void showBook(Book book) {
        System.out.println("The title of the book is: "+book.getTitle()+" and the number of pages of the book is: "+book.getNumberPages());
    }

    private static int askNumberPagesBook() {
        System.out.println("Write the number of pages which the book will have");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static String askTitleBook() {
        System.out.println("Write the title of the book");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}

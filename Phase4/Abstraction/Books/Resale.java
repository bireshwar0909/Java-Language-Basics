package Basics.Phase4.Abstraction.Books;

public class Resale {

    public static void resaleBook(Books bookForResale, boolean DidBuy) {
        System.out.println();
        if (DidBuy == true) {
            System.out.println("Book is resaled!");
        } else if (DidBuy == false) {
            System.out.println("You didn't buy the book, Book can't be resaled!");
        }
    }

    public static void main(String[] args) {

        BookOne bookOne = new BookOne();
        BookTwo bookTwo = new BookTwo();

        boolean DidBuy;

        bookOne.bookName();
        bookOne.bookAuthor();
        bookOne.bookPrice();
        bookOne.bookType();
        DidBuy = bookOne.wannaBuy(true);
        resaleBook(bookOne, DidBuy);

        System.out.println();

        bookTwo.bookName();
        bookTwo.bookAuthor();
        bookTwo.bookPrice();
        bookTwo.bookType();
        DidBuy = bookTwo.wannaBuy(false);

        resaleBook(bookTwo, DidBuy);
    }

}

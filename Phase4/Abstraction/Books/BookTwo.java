package Basics.Phase4.Abstraction.Books;

public class BookTwo extends Books {

    @Override
    public void bookName() {
        System.out.println("Quiet Hands");
    }

    @Override
    public void bookAuthor() {
        System.out.println("Stephen King");
    }

    @Override
    public void bookPrice() {
        System.out.println("$10");
    }

    @Override
    public void bookType() {
        System.out.println("Hardcover");
    }

    @Override
    public boolean wannaBuy(boolean buy) {
        if (buy) {
            System.out.println("You bought the book");
            return true;
        } else {
            System.out.println("You didn't buy the book");
            return false;
        }
    }
    
}

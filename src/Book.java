public class Book {
    String title;
    double price ;
    Book(String title , double price ){
        this.title= title;
        this.price = price ;

    }
    void display () {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
    public class Main {
        public static void main(String[] args) {
            Book[] books = new Book[5];
            books[0] = new Book("english", 200);
            books[1] = new Book("telugu", 300);
            books[2] = new Book("mathematics", 400);
            books[3] = new Book(" Social studies ", 260);
            books[4] = new Book("Science ", 250);
            for (int i = 0; i < books.length; i++) {
                books[i].display();
            }

        }
    }
}

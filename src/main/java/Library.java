import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private String name;
    private ArrayList<Book> collection;
    private HashMap<String, Integer> booksByGenre;
    private HashMap<String, Integer> genreHashmap;

    public Library(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
        this.booksByGenre = new HashMap<>();
    }

    public int countBooks() {
        return collection.size();
    }

    public void addBook(Book book) {
        this.collection.add(book);
        this.booksByGenre.merge(book.getGenre(), 1, Integer::sum);
    }

    public void removeBook (Book book) {
        this.collection.remove(book);
        this.booksByGenre.merge(book.getGenre(), -1, Integer::sum);
    }


    public int countByGenre(String genre) {
        return booksByGenre.get(genre);


    }

    public void addBookToGenre(Book book){
        String genre = book.getGenre();

        if(this.genreHashmap.containsKey(genre)) {
            int counter = genreHashmap.get(genre);

            counter++;

            this.genreHashmap.put(genre, counter);
        }else {

            this.genreHashmap.put(genre, 1);
        }



        }
}



//    public static void main(String[] args) {
//        HashMap<String, Integer> booksByGenre = new HashMap<>();

//        addBook(booksByGenre, "mystery");
//        addBook(booksByGenre, "sci-fi");
//        addBook(booksByGenre, "mystery");
//        addBook(booksByGenre, "sci-fi");


//        System.out.println(booksByGenre);
//    }
//}

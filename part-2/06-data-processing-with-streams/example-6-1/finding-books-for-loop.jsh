import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//
// Example 6-1. Finding books with a for-loop
//
// SUPPOSED TASK: First three science-fiction books before 1970 sorted by title.
//


enum Genre {
    DYSTOPIAN,
    HORROR,
    SCIENCE_FICTION;
}

record Book(String title, int year, Genre genre) {
    // NO BODY
}

List<Book> books =
    List.of(new Book("Dracula", 1897, Genre.HORROR),
        new Book("Brave New World", 1932, Genre.DYSTOPIAN),
        new Book("1984", 1949, Genre.DYSTOPIAN),
        new Book("Dune", 1965, Genre.SCIENCE_FICTION),
        new Book("Do Androids Dream of Electric Sheep", 1968, Genre.SCIENCE_FICTION),
        new Book("The Shining", 1977, Genre.HORROR),
        new Book("Neuromancer", 1984, Genre.SCIENCE_FICTION),
        new Book("The Handmaid's Tale", 1985, Genre.DYSTOPIAN));

// books must be mutable for sorting
books = new ArrayList<>(books);

Collections.sort(books, Comparator.comparing(Book::title));

List<String> result = new ArrayList<>();

for (var book : books) {

    if (book.year() >= 1970) {
        continue;
    }

    if (book.genre() != Genre.SCIENCE_FICTION) {
        continue;
    }

    var title = book.title();
    result.add(title);

    if (result.size() == 3) {
        break;
    }
}

System.out.println("Found books: " + result)

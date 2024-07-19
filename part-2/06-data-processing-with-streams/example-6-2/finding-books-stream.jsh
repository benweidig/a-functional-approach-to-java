//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//
// Example 6-2. Finding books with a Stream
//
// SUPPOSED TASK: First three science-fiction books before 1970 sorted by title.
//

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

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

List<String> result = books.stream()
                           .filter(book -> book.year() < 1970)
                           .filter(book -> book.genre() == Genre.SCIENCE_FICTION)
                           .map(Book::title)
                           .sorted()
                           .limit(3)
                           .collect(Collectors.toList());

System.out.println("Found books: " + result)

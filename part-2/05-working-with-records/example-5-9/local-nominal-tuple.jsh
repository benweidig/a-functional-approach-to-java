//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
// 
// Example 5-9. Stremm pipeline with localized Record
//

import java.util.Map
import java.util.List


Map<Integer, List<String>> albums =
  Map.of(1990, List.of("Bossanova", " Listen Without Prejudice"),
         1991, List.of("Nevermind", "Ten", "Blue lines"),
         1992, List.of("The Chronic", "Rage Against the Machine"),
         1993, List.of("Enter the Wu-Tang (36 Chambers)"),
         1994, List.of("Ill Communication", "The Downward Spiral"),
         1995, List.of("Foo Fighters", "Exit Planet Dust"),
         1996, List.of("Endtroducing", "The Score", "No Code"),
         1997, List.of("The Fat of the Land", "Blur", "Dig your own hole"),
         1998, List.of("Mezzanine", "You've Come a Long Way, Baby"),
         1999, List.of("The Slim Shady LP", "Californication", "Play"));


List<String> filterAlbums(Map<Integer, List<String>> albums,
                                 int minimumYear) {

    record AlbumsPerYear(int year, List<String> titles) {

        AlbumsPerYear(Map.Entry<Integer, List<String>> entry) {
            this(entry.getKey(), entry.getValue());
        }

        static Predicate<AlbumsPerYear> minimumYear(int year) {
            return albumsPerYear -> albumsPerYear.year() >= year;
        }

        static Comparator<AlbumsPerYear> sortByYear() {
            return Comparator.comparing(AlbumsPerYear::year);
        }
    }

    return albums.entrySet()
                 .stream()
                 .map(AlbumsPerYear::new)
                 .filter(AlbumsPerYear.minimumYear(minimumYear))
                 .sorted(AlbumsPerYear.sortByYear())
                 .map(AlbumsPerYear::titles)
                 .flatMap(List::stream)
                 .toList();
}

var result = filterAlbums(albums, 1995)

System.out.println("filtered = " + result)

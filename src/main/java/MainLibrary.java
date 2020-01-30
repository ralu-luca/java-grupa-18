public class MainLibrary {
    public static void main(String[] args) {
        Novel novel = new Novel("Liberty", 128, "str");
        ArtAlbum artAlbum = new ArtAlbum("Egipt", 85, "G");

        Book[] biblioteca = new Book[3];
        biblioteca[0] = novel;
        biblioteca[1] = artAlbum;

        Library library = new Library(biblioteca);
        biblioteca = library.add(new Novel("Four Horsemen", 210, "str"), biblioteca);


        for (Book elementLista : biblioteca) {
            if (elementLista != null) {
                System.out.println(elementLista.getName());
            }
        }
        Library library1 = new Library(biblioteca);
        biblioteca = library1.remove(0);

        for (Book elementLista : biblioteca) {
            if (elementLista != null) {
                System.out.println(elementLista.getName());
            }
        }
    }
}





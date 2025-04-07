import java.util.*;

class LibraryController implements LibraryRequirement {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buku \"" + book.getTitle() + "\" ditambahkan.");
    }

    @Override
    public void removeBook(int index) {
        if (index >= 1 && index <= books.size()) {
            Book removedBook = books.remove(index - 1);
            System.out.println("Buku \"" + removedBook.getTitle() + "\" dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    @Override
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("Tidak ada buku yang terdaftar.");
            return;
        }
        System.out.println("Daftar Buku:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).getTitle() + " - " + books.get(i).getAuthor());
        }
    }
}

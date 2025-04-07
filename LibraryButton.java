class LibraryButton implements LibraryService {
    private LibraryController controller;

    public LibraryButton(LibraryController controller) {
        this.controller = controller;
    }

    @Override
    public void addBook(Book book) {
        controller.addBook(book);
    }

    @Override
    public void removeBook(int index) {
        controller.removeBook(index);
    }

    @Override
    public void showBooks() {
        controller.showBooks();
    }
}

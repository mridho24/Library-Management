import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryController controller = new LibraryController();
        LibraryButton button = new LibraryButton(controller);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Buku");
            System.out.println("2. Tambah Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    button.showBooks();
                    break;
                case 2:
                    System.out.print("Masukkan judul buku: ");
                    String title = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String author = scanner.nextLine();
                    button.addBook(new Book(title, author));
                    break;
                case 3:
                    button.showBooks();
                    System.out.print("Masukkan nomor buku yang akan dihapus: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine();
                    button.removeBook(removeIndex);
                    break;
                case 4:
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

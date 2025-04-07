# Library-Management

## 📌 Latar Belakang
Di era digital saat ini, sistem manajemen perpustakaan berbasis perangkat lunak menjadi solusi efektif dalam mengelola koleksi buku secara efisien. Aplikasi **Library Management** ini dirancang untuk mempermudah pengguna dalam menambahkan, menghapus, dan melihat daftar buku yang tersedia dalam perpustakaan.

## 🎯 Tujuan
### 1. Mempermudah Pengelolaan Buku
Membantu pengguna dalam menambahkan, menghapus, dan melihat daftar buku secara cepat dan efisien.

### 2. Menerapkan Arsitektur Modular
Menggunakan pendekatan berbasis kelas dan antarmuka agar kode lebih mudah dikembangkan dan dikelola.

### 3. Menjadi Dasar Pengembangan Lebih Lanjut
Proyek ini dapat dikembangkan lebih lanjut dengan fitur tambahan seperti pencarian buku, kategori buku, atau integrasi database.

---

## ⚙️ Struktur Proyek
```
LibraryManagement/
│── src/
│   ├── Main.java
│   ├── Book.java
│   ├── LibraryController.java
│   ├── LibraryButton.java
│   ├── LibraryRequirement.java
│   ├── LibraryService.java
│── README.md
```

## 📂 Penjelasan File
- **`Main.java`** → Program utama yang menjalankan sistem perpustakaan.
- **`Book.java`** → Kelas yang merepresentasikan buku dengan atribut `title` dan `author`.
- **`LibraryController.java`** → Kelas yang mengelola daftar buku dengan metode untuk menambahkan, menghapus, dan menampilkan buku.
- **`LibraryButton.java`** → Bertindak sebagai penghubung antara `Main` dan `LibraryController`.
- **`LibraryRequirement.java`** → Antarmuka yang menentukan metode dasar untuk manajemen buku.
- **`LibraryService.java`** → Antarmuka lain yang diterapkan oleh `LibraryButton` untuk menangani operasi buku.

---

## 🔧 Cara Menggunakan
### 1. Clone Repository (Jika ada di GitHub)
```sh
git clone https://github.com/username/LibraryManagement.git
cd LibraryManagement
```

### 2. Jalankan Program
- Buka proyek di VS Code atau IDE Java lainnya.
- Jalankan `Main.java`.

### 3. Navigasi dalam Program
- Pilih `1` untuk melihat daftar buku.
- Pilih `2` untuk menambahkan buku baru.
- Pilih `3` untuk menghapus buku berdasarkan nomor urutnya.
- Pilih `4` untuk keluar dari program.

---

## 📌 Contoh Penggunaan
```
Menu:
1. Tampilkan Buku
2. Tambah Buku
3. Hapus Buku
4. Keluar
Pilih menu: 2
Masukkan judul buku: Kelas akhir
Masukkan penulis buku: Agradika
Buku "Kelas akhir" ditambahkan.
```

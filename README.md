# PASD_jobsheet3ArrayOfObjects

3.2 —— Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
Jawaban: tidak harus. class yang akan dijadikan array of objects tidak wajib memiliki atribut dan method sekaligus. hal ini dibuktikan pada uji coba 3.2, dimana class Mahasiswa20.java hanya memiliki atribut saja (nim, nama, kelas, ipk) tanpa method apapun, namun program tetap berjalan normal dan array of object-nya berhasil dibuat. yang terpenting adalah class tersebut dapat diinstansiasi menggunakan keyword new. array of objects hanya membutuhkan tipe data berupa class, sedangkan isi dari class itu sendiri (apakah punya atribut, method, atau keduanya) bersifat bebas/opsional.
2. Apa yang dilakukan oleh kode program berikut?
Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];
Jawaban: kode tersebut melakukan deklarasi sekaligus inisialisasi sebuah array bernama arrayOfObjects yang bertipe Mahasiswa dengan kapasitas 3 elemen. namun pada tahap ini, ketiga slot array masih bernilai null karena objek Mahasiswa belum diinstansiasi.
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?
arrayOfMahasiswa[0] = new Mahasiswa();
Jawaban: class Mahasiswa tidak memiliki konstruktor yang tertulis secara eksplisit. namun Java secara otomatis menyediakan konstruktor default tanpa parameter apabila programmer tidak mendefinisikan konstruktor apapun. itulah mengapa new Mahasiswa() tetap bisa dipanggil meskipun konstruktor tidak ditulis secara manual di dalam class tersebut.
4. Apa yang dilakukan oleh kode program berikut?
arrayOfMahasiswa[0] = new Mahasiswa();
arrayOfMahasiswa[0].nim = "244107060033";
arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
arrayOfMahasiswa[0].kelas = "SIB-1E";
arrayOfMahasiswa[0].ipk = (float) 3.75;
Jawaban: kode tersebut menginstansiasi objek Mahasiswa baru pada index ke-0 dari array arrayOfMahasiswa, kemudian mengisi seluruh atributnya (nim, nama, kelas, ipk) dengan data yang sudah ditentukan. (float) pada baris terakhir adalah casting untuk memastikan nilai 3.75 tersimpan sebagai tipe data float.
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
Jawaban: class Mahasiswa dan MahasiswaDemo dipisahkan karena keduanya memiliki tanggung jawab yang berbeda. class Mahasiswa berperan sebagai blueprint/model yang hanya mendefinisikan atribut dari objek mahasiswa, sedangkan class MahasiswaDemo berperan sebagai class eksekutor yang bertugas menjalankan program seperti membuat objek, mengisi data, dan menampilkannya ke layar. pemisahan ini bertujuan agar kode lebih terstruktur, mudah dibaca, dan mudah dikembangkan sesuai prinsip OOP.

3.3 —— Pertanyaan
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
Mahasiswa[] myArrayOfMahasiswa = new Mahasiswa[3];
myArrayOfMahasiswa[0].nim = "244107060033";
myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
myArrayOfMahasiswa[0].kelas = "SIB-1E";
myArrayOfMahasiswa[0].ipk = (float) 3.75;
Jawaban: kode tersebut menyebabkan error NullPointerException karena ketika tertulis new Mahasiswa[3], Java hanya membuat array berisi 3 slot kosong (null). masing-masing elemen belum menunjuk ke objek Mahasiswa manapun. jadi saat mengakses myArrayOfMahasiswa[0].nim, program crash karena myArrayOfMahasiswa[0] masih bernilai null.

3.4 —— Pertanyaan
1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya
Jawaban: iya, bisa. konsep ini disebut dengan constructor overloading. Java membedakan construktor berdasarkan jumlah dan tipe. contoh:

public class Matakuliah {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Constructor tanpa parameter
    public Matakuliah() {
        this.kode = "-";
        this.nama = "-";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // Constructor dengan 2 parameter
    public Matakuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // Constructor dengan semua parameter
    public Matakuliah(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah
3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar
# PASD_jobsheet3ArrayOfObjects

3.2 —— Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
Jawaban: tidak harus. class yang akan dijadikan array of objects tidak wajib memiliki atribut dan method sekaligus. hal ini dibuktikan pada uji coba 3.2, dimana class Mahasiswa20.java hanya memiliki atribut saja (nim, nama, kelas, ipk) tanpa method apapun, namun program tetap berjalan normal dan array of object-nya berhasil dibuat. yang terpenting adalah class tersebut dapat diinstansiasi menggunakan keyword new. array of objects hanya membutuhkan tipe data berupa class, sedangkan isi dari class itu sendiri (apakah punya atribut, method, atau keduanya) bersifat bebas/opsional.
2. Apa yang dilakukan oleh kode program berikut?
Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];
Jawaban: kode tersebut melakukan deklarasi sekaligus inisialisasi sebuah array bernama arrayOfObjects yang bertipe Mahasiswa dengan kapasitas 3 elemen. namun pada tahap ini, ketiga slot array masih bernilai null karena objek Mahasiswa belum diinstansiasi.
3. 3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?
arrayOfMahasiswa[0] = new Mahasiswa();
Jawaban: class Mahasiswa tidak memiliki konstruktor yang tertulis secara eksplisit. namun Java secara otomatis menyediakan konstruktor default tanpa parameter apabila programmer tidak mendefinisikan konstruktor apapun. itulah mengapa new Mahasiswa() tetap bisa dipanggil meskipun konstruktor tidak ditulis secara manual di dalam class tersebut.
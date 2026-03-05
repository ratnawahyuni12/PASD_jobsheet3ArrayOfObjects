import java.util.Scanner;
public class MatakuliahDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah20[] arrayOfMatakuliah = new Matakuliah20[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfMatakuliah[i] = new Matakuliah20();
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }

        sc.close();
    }
}

public class DataDosen20 {
    public void dataSemuaDosen(Dosen20[] arrayOfDosen) {
        int no = 1;
        for (Dosen20 Dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no);
            System.out.println("Kode           : " + Dosen.kode);
            System.out.println("Nama           : " + Dosen.nama);
            System.out.println("Jenis Kelamin  : " + (Dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia           : " + Dosen.usia);
            System.out.println("--------------------------------");
            no++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen20 Dosen : arrayOfDosen) {
            if (Dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria      : " + pria);
        System.out.println("Jumlah Dosen Wanita    : " + wanita);
        System.out.println("-----------------------------------");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;
        for (Dosen20 Dosen : arrayOfDosen) {
            if (Dosen.jenisKelamin) {
                totalPria += Dosen.usia;
                jumlahPria++;
            } else {
                totalWanita += Dosen.usia;
                jumlahWanita++;
            }
        }
        double rerataPria = jumlahPria > 0 ? (double) totalPria / jumlahPria : 0;
        double rerataWanita = jumlahWanita > 0 ? (double) totalWanita / jumlahWanita : 0;
        System.out.println("Rata - rata Usia Dosen Pria    : " + rerataPria);
        System.out.println("Rata - rata Usia Dosen Wanita  : " + rerataWanita);
        System.out.println("-----------------------------------");
    }

    public void infoDosenPalingTua(Dosen20[] arrayOfDosen) {
        Dosen20 palingTua = arrayOfDosen[0];
        for (Dosen20 Dosen : arrayOfDosen) {
            if (Dosen.usia > palingTua.usia) {
                palingTua = Dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        System.out.println("Kode          : " + palingTua.kode);
        System.out.println("Nama          : " + palingTua.nama);
        System.out.println("Jenis Kelamin : " + (palingTua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + palingTua.usia);
        System.out.println("--------------------------------");
    }

    public void infoDosenPalingMuda(Dosen20[] arrayOfDosen) {
        Dosen20 palingMuda = arrayOfDosen[0];
        for (Dosen20 Dosen : arrayOfDosen) {
            if (Dosen.usia < palingMuda.usia) {
                palingMuda = Dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        System.out.println("Kode          : " + palingMuda.kode);
        System.out.println("Nama          : " + palingMuda.nama);
        System.out.println("Jenis Kelamin : " + (palingMuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + palingMuda.usia);
        System.out.println("--------------------------------");
    }
}
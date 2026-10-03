import java.util.Scanner;

public class DataAngkatan26 {

    
    public static void tampilkanWatermark() {
        System.out.println("=========================================");
        System.out.println("    SISTEM DATA ANGKATAN 26 - KELOMPOK 43 ");
        System.out.println("      [ WATERMARK: ANGKATAN26 KEL 43 ]    ");
        System.out.println("=========================================");
    }

    public static String cekStatusKelulusan(double ipk, int totalSks) {
        if (ipk >= 2.0 && totalSks >= 144) {
            return "LULUS (Memenuhi Syarat)";
        } else if (ipk >= 2.0 && totalSks < 144) {
            return "AKTIF (SKS Belum Cukup)";
        } else {
            return "EVALUASI (IPK di bawah standar)";
        }
    }

    public static void cetakDaftarNama(String namaDasar, int jumlah) {
        System.out.println("\n--- Menggenerasi Daftar Identitas Mahasiswa ---");
        for (int i = 1; i <= jumlah; i++) {
            System.out.println(i + ". " + namaDasar + " _2026_Kel43_" + i);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        tampilkanWatermark();

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan IPK Terakhir  : ");
        double ipkMhs = input.nextDouble();

        System.out.print("Masukkan Jumlah SKS    : ");
        int sksMhs = input.nextInt();

        String status = cekStatusKelulusan(ipkMhs, sksMhs);

        System.out.println("\n================ HASIL ANALISIS ================");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Status Akademik: " + status);
        System.out.println("=================================================");

        System.out.print("\nMasukkan jumlah replikasi nama untuk database: ");
        int jumlahLoop = input.nextInt();
        cetakDaftarNama(nama, jumlahLoop);

        System.out.println("\n[ PROGRAM SELESAI - ANGKATAN26 KEL 43 ]");
        input.close();
    }
}

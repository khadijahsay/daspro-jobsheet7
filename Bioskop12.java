import java.util.Scanner;

public class Bioskop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiketTerjual = 0;
        double totalHargaPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            // Validasi input negatif
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid (negatif). Silakan masukkan ulang!");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; // Diskon 15%
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // Diskon 10%
            }

            double totalHargaPembelian = jumlahTiket * hargaTiket * (1 - diskon);
            totalTiketTerjual += jumlahTiket;
            totalHargaPenjualan += totalHargaPembelian;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + totalHargaPembelian);
        }

        System.out.println("\n--- REKAP PENJUALAN HARI INI ---");
        System.out.println("Total tiket terjual: " + totalTiketTerjual + " tiket");
        System.out.println("Total harga penjualan: Rp " + totalHargaPenjualan);

        sc.close();
    }
}

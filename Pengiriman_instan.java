import java.util.Scanner;

public class Pengiriman_instan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String username, password;

            // Login
            System.out.println("=== Login ===");
            System.out.print("Username: ");
            username = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();

            if (username.equals("user") && password.equals("useraja")) {
                System.out.println("\nLogin Berhasil!");

                // Pilih kendaraan
                int pilihanKendaraan;
                int ongkosKirim = 0;
                System.out.println("\n=== Pilihan Kendaraan ===");
                System.out.println("1. Motor (Rp 25.000)");
                System.out.println("2. Mobil (Rp 50.000)");
                System.out.println("3. Pick Up (Rp 100.000)");
                System.out.print("Pilihan: ");
                pilihanKendaraan = scanner.nextInt();

                if (pilihanKendaraan == 1) {
                    ongkosKirim = 25000;
                } else if (pilihanKendaraan == 2) {
                    ongkosKirim = 50000;
                } else if (pilihanKendaraan == 3) {
                    ongkosKirim = 100000;
                } else {
                    System.out.println("Pilihan tidak tersedia!");
                    System.exit(0);
                }

                // Pilihan Kota
                int pilihanKota;
                int ongkosJalan = 0;
                System.out.println("\n=== Kota Tujuan ===");
                System.out.println("1. Depok (Rp 10.000)");
                System.out.println("2. Bogor (Rp 15.000)");
                System.out.println("3. Bekasi (Rp 20.000)");
                System.out.print("Pilihan: ");
                pilihanKota = scanner.nextInt();

                if (pilihanKota == 1) {
                    ongkosJalan = 10000;
                } else if (pilihanKota == 2) {
                    ongkosJalan = 15000;
                } else if (pilihanKota == 3) {
                    ongkosJalan = 20000;
                } else {
                    System.out.println("Pilihan tidak tersedia!");
                    System.exit(0);
                }

                // Hitung Total Harga
                int totalHarga = ongkosJalan + ongkosKirim;
                System.out.println("\nTotal Harga: Rp " + totalHarga);
            } else {
                System.out.println("\nLogin Gagal! Username atau Password salah.");
            }

        }
    }
}

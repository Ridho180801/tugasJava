import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di program Menu Makanan dan Minuman!");

        System.out.println("1. Makanan");
        System.out.println("2. Minuman");

        System.out.print("Silakan pilih salah satu opsi: ");

        int pilihanUtama = input.nextInt();

        switch (pilihanUtama) {
            case 1:

                System.out.println("1. Makanan Ringan");
                System.out.println("2. Makanan Berat");
                System.out.print("Anda memilih Makanan. Silakan pilih opsi: ");

                int pilihanMakanan = input.nextInt();

                switch (pilihanMakanan) {
                    case 1:

                        System.out.println("1. Manis");
                        System.out.println("2. Gurih");
                        System.out.print("Anda memilih Makanan Ringan. Silakan pilih opsi: ");

                        int pilihanRasaRingan = input.nextInt();

                        switch (pilihanRasaRingan) {
                            case 1:
                                System.out.println("Anda memilih Makanan Ringan dengan rasa Manis.");
                                System.out.println("Harga Makanan Ringan Manis: Rp.50.000");
                                break;
                            case 2:
                                System.out.println("Anda memilih Makanan Ringan dengan rasa Gurih.");
                                System.out.println("Harga Makanan Ringan Gurih: Rp.45.000");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                                break;
                        }

                        break;
                    case 2:

                        System.out.println("1. Nasi");
                        System.out.println("2. Mie");
                        System.out.print("Anda memilih Makanan Berat. Silakan pilih opsi: ");

                        int pilihanMakananBerat = input.nextInt();

                        switch (pilihanMakananBerat) {
                            case 1:
                                System.out.println("Anda memilih Makanan Berat dengan nasi.");
                                System.out.println("Harga Makanan Berat dengan nasi: Rp 10.000");
                                break;
                            case 2:
                                System.out.println("Anda memilih Makanan Berat dengan mie.");
                                System.out.println("Harga Makanan Berat dengan mie: Rp 12.000");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                                break;
                        }

                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }

                break;
            case 2:

                System.out.println("1. Minuman Sehat");
                System.out.println("2. Minuman Tidak Sehat");
                System.out.print("Anda memilih Minuman. Silakan pilih opsi: ");

                int pilihanMinuman = input.nextInt();

                switch (pilihanMinuman) {
                    case 1:

                        System.out.println("1. Jus");
                        System.out.println("2. Jamu");
                        System.out.print("Anda memilih Minuman Sehat. Silakan pilih opsi: ");

                        int pilihanMinumanSehat = input.nextInt();

                        switch (pilihanMinumanSehat) {
                            case 1:
                                System.out.println("Anda memilih Minuman Sehat dengan jus.");
                                System.out.println("Harga Minuman Sehat dengan jus: Rp.20.000");
                                break;
                            case 2:
                                System.out.println("Anda memilih Minuman Sehat dengan jamu.");
                                System.out.println("Harga Minuman Sehat dengan jamu: Rp.10.000");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                                break;
                        }

                        break;
                    case 2:

                        System.out.println("1. Alkohol");
                        System.out.println("2. Soda");
                        System.out.print("Anda memilih Minuman Tidak Sehat. Silakan pilih opsi: ");

                        int pilihanMinumanTidakSehat = input.nextInt();

                        switch (pilihanMinumanTidakSehat) {
                            case 1:
                                System.out.println("Anda memilih Minuman Tidak Sehat dengan alkohol.");
                                System.out.println("Harga Minuman Tidak Sehat dengan alkohol: Rp.90.000");
                                break;
                            case 2:
                                System.out.println("Anda memilih Minuman Tidak Sehat dengan soda.");
                                System.out.println("Harga Minuman Tidak Sehat dengan soda: Rp.10.000");
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                                break;
                        }

                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }

                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        input.close();
    }
}

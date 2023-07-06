import java.util.Scanner;

public class nilaiAkhir {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nim, nama;
            double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

            System.out.print("Masukkan NIM: ");
            nim = input.nextLine();

            System.out.print("Masukkan nama: ");
            nama = input.nextLine();

            System.out.print("Masukkan nilai Tugas: ");
            nilaiTugas = input.nextDouble();

            System.out.print("Masukkan nilai UTS: ");
            nilaiUTS = input.nextDouble();

            System.out.print("Masukkan nilai UAS: ");
            nilaiUAS = input.nextDouble();

            // Menghitung nilai akhir
            nilaiAkhir = (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.5);

            // Menampilkan nilai akhir
            System.out.println("Nilai akhir " + nama + " dengan NIM " + nim + " adalah " + nilaiAkhir);
        }
    }
}

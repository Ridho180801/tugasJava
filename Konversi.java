import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int seconds;
            int minutes;
            int remainingSecond;

            System.out.print("Masukkan jumlah detik: ");
            seconds = input.nextInt();

            minutes = seconds / 60;
            remainingSecond = seconds % 60;

            System.out.println(seconds + " detik sama dengan " + minutes + " menit" + remainingSecond + " detik ");
        }
    }
}


import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // final double TAX_RATE = 0.11; // konstanta nilai pajak 11%
            String name;
            double grossSalary, netSalary, TAX_RATE;

            System.out.print("Masukkan nama karyawan: ");
            name = input.nextLine();

            System.out.print("Masukkan total gaji karyawan: ");
            grossSalary = input.nextDouble();
            TAX_RATE = grossSalary * 0.11;
            netSalary = grossSalary - TAX_RATE;

            System.out.println("Pajak dari " + name + " adalah " + TAX_RATE);
            System.out.println("Gaji bersih dari " + name + " adalah " + netSalary);
        }
    }
}

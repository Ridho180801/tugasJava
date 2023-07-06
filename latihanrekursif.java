import java.util.*;

public class latihanrekursif {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan nilai : ");
        int nilai = inputUser.nextInt();
        System.out.println("Anda memasukan nilai : " + nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Jumlah =" + jumlah);

        System.out.println("\n");

        printNilai(nilai);
        int faktorial = hitungFaktorial(nilai);
        System.out.println("Hasil faktorial =" + faktorial);

        System.out.println("\n");

    }

    private static int hitungFaktorial(int parameter) {
        System.out.println("parameter = " + parameter);

        if (parameter == 1) {
            return parameter;
        }

        return parameter * hitungFaktorial(parameter - 1);
    }

    private static int jumlahNilai(int parameter) {
        System.out.println("parameter = " + parameter);

        if (parameter == 0) {
            return parameter;
        }

        return parameter + jumlahNilai(parameter - 1);
    }

    private static void printNilai(int parameter) {
        System.out.println(" nilai = " + parameter);

        if (parameter == 0) {
            return;
        }

        parameter--;

        printNilai(parameter);

    }

}

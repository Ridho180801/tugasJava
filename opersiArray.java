import java.util.Arrays;
import java.util.Collections;

public class opersiArray {

    public static void main(String[] args) {

        int[] arrayKe1 = { 1, 2, 3, 4, 5 };

        // ngubah array ke string
        System.out.println("\nNgubah array ke string\n----------------------");
        printArray(arrayKe1);

        // mengcopy array
        System.out.println("\nMengcopy array\n----------------------");
        int[] arrayKe2 = new int[5];
        printArray(arrayKe1);
        printArray(arrayKe2); // <---- ini kondisi sebelum dicopy

        System.out.println("\nMengcopy dengan loop\n----------------------");
        for (int i = 0; i < arrayKe1.length; i++) {
            arrayKe2[i] = arrayKe1[i];
        }
        printArray(arrayKe1);
        printArray(arrayKe2);

        System.out.println("\nMengcopy dengan copyOf\n----------------------");
        int[] arrayKe3 = Arrays.copyOf(arrayKe1, 4); // <-- 4 ini jumlah indeksnya
        printArray(arrayKe1);
        printArray(arrayKe3);

        System.out.println("\nMengcopy dengan copyOfRange\n----------------------");
        int[] arrayKe4 = Arrays.copyOfRange(arrayKe1, 3, 5); // <-- ngisi to nya lebihin 1 indx dri last indx
        printArray(arrayKe1);
        printArray(arrayKe4);

        // Fill array
        System.out.println("\nFill Array\n----------------------");
        int[] arrayKe5 = new int[10]; // <-- 10 = jumlah indexnya
        printArray(arrayKe5);
        Arrays.fill(arrayKe5, 5); // 5 = isi indexnya
        printArray(arrayKe5);

        // komparasi array
        System.out.println("\nKomparasi Array\n----------------------");
        int[] arrayKe6 = { 6, 7, 8, 9, 10 };
        int[] arrayKe7 = { 6, 7, 8, 9, 10 };

        System.out.println("\nMembandingkan 2 buah array\n----------------------");
        if (Arrays.equals(arrayKe6, arrayKe7)) {
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini beda");
        }

        System.out.println("\nMengecek array yg lebih besar\n-------------------------------");
        int[] arrayKe8 = { 3, 5, 2, 1, 6 };
        printArray(arrayKe8);
        printArray(arrayKe7);

        System.out.println(Arrays.compare(arrayKe8, arrayKe7)); // klo array prtma lbh besar hasilnya 1 klo
                                                                // array ke-2 lbh besar hasilnya -1 dan klo
                                                                // sma hasilnya 0
        System.out.println("\nMengecek index yg beda\n------------------------");
        printArray(arrayKe8); // dia akan nyari indx yg beda,klo di indx ke-0 udh beda maka dia akan cetak 0
        printArray(arrayKe7);
        System.out.println(Arrays.mismatch(arrayKe8, arrayKe7));

        printArray(arrayKe6); // klo gada indx yg beda dia akan cetak -1
        printArray(arrayKe7);
        System.out.println(Arrays.mismatch(arrayKe6, arrayKe7));

        System.out.println("\nMengurutkan Arrays\n------------------------");
        int[] arrayKe9 = { 1, 5, 3, 2, 6, 8, 7 };
        /*
         * printArray(arrayKe9);
         * Arrays.sort(arrayKe9);
         * printArray(arrayKe9);
         */
        System.out.println("\nSearch Arrays\n------------------------");
        int angka = 2;
        int posisi = Arrays.binarySearch(arrayKe9, angka);
        System.out.println("Angka " + angka + " ada di index ke" + posisi);

        System.out.println("\n \n");

        /*
         * TUGAS : 1. Sort array dri angka terbesar
         * 2. Buat penjumlahaan 2 buah array *clue buat method buat dan pke copyof
         * sehingga menghasilkan array baru yg merupakan penjumlahan dri 2 buah array
         * 3. Menggabungkan 2 buah array *clue buat method dlu dan pke copyof
         */

        System.out.println("\nSort array dri angka terbesar\n------------------------");
        Integer[] arrayKe10 = { 5, 2, 8, 1, 9 };

        System.out.println("Array sebelum diurutkan:");
        printtArray(arrayKe10);

        Arrays.sort(arrayKe10, Collections.reverseOrder()); /*
                                                             * kuncinya buat method looping dlu trs tipe array nya
                                                             * harus Integer gaboleh int. dan wktu di sort pke
                                                             * Collection.reverseOrder,dan pke
                                                             * import.java.utill.collections
                                                             */

        System.out.println("Array setelah diurutkan:");
        printtArray(arrayKe10);

        System.out.println("\nPenjumlahan array\n------------------------");

        int[] arrayKe11 = { 2, 4, 6, 8, 10 };
        int[] arrayKe12 = { 1, 3, 5, 7, 9 };

        int[] sumArray = new int[arrayKe11.length]; // Array untuk menyimpan hasil penjumlahan

        if (arrayKe11.length != arrayKe12.length) {
            System.out.println("Jumlah elemen dalam kedua array harus sama."); // if else itu optional intinya ada di
                                                                               // for loop
        } else {
            for (int i = 0; i < arrayKe11.length; i++) { // klo tanpa buat array baru jga bisa,tpi nnti nilai slh 1
                                                         // array akan berubah
                sumArray[i] = arrayKe11[i] + arrayKe12[i];
            }

            printArray(arrayKe11);
            printArray(arrayKe12);
            System.out.println("Hasil penjumlahan array: " + Arrays.toString(sumArray));

            System.out.println();
        }

        System.out.println("\nMenggabungkan 2 buah array\n--------------------------");

        int[] arrayKe13 = { 2, 4, 6, 8, 10 };
        int[] arrrayKe14 = { 1, 3, 5, 7, 9 };

        int[] gabungArray = new int[arrayKe13.length + arrrayKe14.length]; // Array untuk menyimpan hasil penggabungan

        // Menggabungkan arrayKe13 dan arrrayKe14 ke dalam gabungArray
        System.arraycopy(arrayKe13, 0, gabungArray, 0, arrayKe13.length);
        System.arraycopy(arrrayKe14, 0, gabungArray, arrayKe13.length, arrrayKe14.length);

        printArray(arrayKe13);
        printArray(arrrayKe14);
        System.out.println("Hasil penggabungan array: " + Arrays.toString(gabungArray));

        System.out.println();

        System.out.println("\nNyoba array string\n--------------------------");
        String[] nama = { "jamal", "burhan", "sora", "gembul" };

        for (int i = 0; i < nama.length; i++) {
            System.out.println("Index ke- " + i + " adalah" + nama[i]);
        }

        System.out.println();

        printttArray(nama);

        System.out.println();

    }

    private static void printArray(int[] dataArray) {
        System.out.println("array" + Arrays.toString(dataArray));
    }

    public static void printtArray(Integer[] jamal) {
        for (int burhan : jamal) {
            System.out.print(burhan + " ");
        }

    }

    private static void printttArray(String[] dataaArray) {
        System.out.println("array" + Arrays.toString(dataaArray));
    }
}

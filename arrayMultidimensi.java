import java.util.Arrays;

public class arrayMultidimensi {

    public static void main(String[] args) {

        System.out.println("\nPrint array multidimensi dgn looping \n--------------------------");

        String[][] kontak = {
                { "Ridho", "180801", "ridho@gmail.com" },
                { "Abdul", "010818", "abdul@gmail.com" },
                { "Aziz", "011801", "aziz@gmail.com" }
        };
        System.out.println();

        printArray(kontak);

        /* System.out.println(Arrays.toString(kontak[i])); <-- pke yg ni jg bisa */
    }

    System.out.println();

    System.out.println("\nPrint array multidimensi dgn assigment  \n--------------------------");
    // buat method dlu

    /*
     * int[][] array_2D = {
     * { 1, 2 },
     * { 3, 4 }
     * };
     * 
     * printArray(array_2D);
     */

    System.out.println();

    }

    private static void printArray(int[][] dataArray) {
        for (int i = 0; i < dataArray; i++) {

            System.out.println("Nama : " + dataArray[i][0]);
            System.out.println("Npm : " + dataArray[i][1]);
            System.out.println("Email : " + dataArray[i][2]);
        
    }

}

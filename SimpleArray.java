package RosyidAzh;
import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[6];


        System.out.println("Masukkan 6 angka:");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Data ke-" + i + ": ");
            angka[i] = input.nextInt();
        }


        System.out.println("Menampilkan Data:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i] + " --> " + (angka[i] % 2 == 0 ? "GENAP" : "GANJIL"));
        }

        int totalPenjumlahan = 0;
        for (int i = 0; i < angka.length; i++) {
            totalPenjumlahan += angka[i];
        }

        double rataRata = (int) totalPenjumlahan / angka.length;

        System.out.println("TOTAL PENJUMLAHAN: " + totalPenjumlahan);
        System.out.println("RATA-RATA: " + rataRata);
    }
}

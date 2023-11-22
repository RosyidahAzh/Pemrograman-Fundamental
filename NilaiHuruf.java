package RosyidAzh;

import java.util.Scanner;
public class NilaiHuruf {

    public static void main(String[] a) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Huruf: ");

        char huruf = input.next().charAt(0);
        double Konversi = 0;

        if (huruf == 'A') {
            Konversi = 4.0;
        } else if (huruf =='B') {
            Konversi = 3.0;
        } else if (huruf == 'C') {
            Konversi = 2.0;
        } else if (huruf == 'D') {
            Konversi = 1.0;
        } else if (huruf == 'R') {
            Konversi = 0.0;
        } else {
            System.out.println("Huruf selain A, B, C, D, dan R Tidak bisa dikonversi");

        }

        if(Konversi != 0){
            System.out.println(" Nilai Huruf " + huruf + " adalah :" + Konversi );
        }
    }
}
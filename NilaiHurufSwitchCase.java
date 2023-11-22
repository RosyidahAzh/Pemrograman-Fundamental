package RosyidAzh;

import java.util.Scanner;

public class NilaiHurufSwitchCase {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai Huruf: ");


        String nilaiHuruf = scanner.next();
        double nilaiIndeks = 0;

        switch (nilaiHuruf) {
            case "A":
                nilaiIndeks = 4.0;
                break;
            case "B":
                nilaiIndeks = 3.0;
                break;
            case "C":
                nilaiIndeks = 2.0;
                break;
            case "D":
                nilaiIndeks = 1.0;
                break;
            case "R":
                nilaiIndeks = 0;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui.");

        }

        System.out.println("Nilai indeks Anda adalah: " + nilaiIndeks);

    }
}
package RosyidAzh;

import  java.util.Scanner;
public class HitungProfit {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai modal penjualan Rp ");
        int modal = input.nextInt();

        System.out.println("Masukkan persentase keuntungan = " );
        int persenUntung = input.nextInt();

        int profit = modal + (modal * persenUntung);

        System.out.println("Modal penjualan adalah : " + modal);
        System.out.println("Persentase keuntungan penjualan adalah : " + persenUntung + "%");
        System.out.println("Profit dari penjualan adalah : " + profit);
    }

}

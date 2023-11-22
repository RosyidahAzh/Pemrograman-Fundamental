package RosyidAzh;

import java.util.Scanner;
public class HargaBaju {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int HargaBaju = 125000;

        System.out.println("Harga Baju Dari Pembeli: ");
        int HargaDariPembeli = input.nextInt();
        input.close();

        if (HargaDariPembeli > HargaBaju) {
            System.out.println("Boleh Dibeli");
        } else if (HargaDariPembeli < HargaBaju) {
            System.out.println("Tidak Boleh Ditawar");
        } else  {
            System.out.println("Harga Valid");
        }


    }
}

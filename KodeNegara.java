package RosyidAzh;
import java.util.Scanner;

public class KodeNegara {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kode negara: ");

        String kodeNegara = input.nextLine();
        String namaNegara = "";

        switch (kodeNegara) {
            case "es":
                namaNegara = "Spain";
                break;
            case "tn":
                namaNegara = "Tunisia";
                break;
            case "id":
                namaNegara = "Indonesia";
                break;
            case "mm":
                namaNegara = "Myanmar";
                break;
            case "in":
                namaNegara = "India";
            default:
                System.out.println("Maaf, kode negara tidak diketahui.");
                input.close();
        }

        System.out.println("Kode negara: " + kodeNegara);
        System.out.println("Nama negara: " + namaNegara);

    }
}

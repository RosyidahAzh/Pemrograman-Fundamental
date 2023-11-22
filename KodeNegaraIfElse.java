package RosyidAzh;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class KodeNegaraIfElse {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            out.print("Masukkan kode Negara: ");

            String kodeNegara = scanner.next();
            String namaNegara = "";


            if (kodeNegara.equals("ES")) {
                namaNegara = "Spain";
            } else if (kodeNegara.equals("TN")) {
                namaNegara = "Tunisia";
            } else if (kodeNegara.equals("ID")) {
                namaNegara = "Indonesia";
            } else if (kodeNegara.equals("MM")) {
                namaNegara = "Myanmar";
            } else if (kodeNegara.equals("IN")) {
                namaNegara = "India";
            } else {
                out.println("Maaf, kode negara tidak diketahui.");
                return;
            }
            out.println("Kode negara: " + kodeNegara);
            out.println("Nama negara: " + namaNegara);
        }
    }


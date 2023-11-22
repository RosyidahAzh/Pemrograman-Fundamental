package RosyidAzh;

public class MenghitungIP {
    public static void main(String[] args) {

        int sksBI = 2;
        int sksPKN = 2;
        int sksSisDig = 3;
        int sksKalkulus = 3;
        int totalSKS = sksBI + sksPKN + sksSisDig + sksKalkulus;

        double IndeksBI = 4.0;
        double IndeksPKN = 3.75;
        double IndeksSisDig = 3.95;
        double IndeksKalkulus = 4.0;
        double totalIndeks = (sksBI * IndeksBI) + (sksPKN * IndeksPKN) + (sksSisDig * IndeksSisDig) +  (sksKalkulus * IndeksKalkulus);

        double ip = (totalIndeks / totalSKS);

        System.out.println("IP anda adalah :" + ip);

    }
}

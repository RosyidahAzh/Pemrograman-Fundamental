package RosyidAzh;

public class MemindahkanNilai {
    public static void main(String args[]){

        int a = 20;
        int b = 31;
        int c = 19;

        System.out.println("Sebelum ditukar, nilai a adalah : " +a+ " dan nilai b = " + b);

        a = b;
        b = c;
        c = a;

        System.out.println("Setelah ditukan, nilai a adalah : " +a+ " dan nilai b = " + b);

    }
}

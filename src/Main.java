import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej prosím hodnotu naměřenou v 06:00: ");
        int sest = sc.nextInt();
        System.out.println("Zadej prosím hodnotu naměřenou ve 12:00: ");
        int dvanact = sc.nextInt();
        System.out.println("Zadej prosím hodnotu naměřenou v 18:00");
        int osmnact = sc.nextInt()*2;
        double prumer = (sest+dvanact+osmnact)/4;
        System.out.println("Průměrná teplota tohoto dne je: "+new DecimalFormat("#,##").format(prumer));
    }
}


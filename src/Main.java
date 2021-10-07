import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej poloměr kruhu: ");
        double polomer = sc.nextDouble();
        double obvod = 2*polomer*Math.PI;
        double obsah = Math.PI*Math.sqrt(polomer);
        System.out.println("Obvod kruhu je: "+new DecimalFormat("#,###").format(obvod) +" a obsah kruhu je: "+new DecimalFormat("#,###").format(obsah));
    }
}

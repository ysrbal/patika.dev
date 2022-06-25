import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner girdi = new Scanner(System.in);

    double km, kmbasi, mintutar, acilis, odenecektutar;
    kmbasi = 2.20;
    acilis = 10;
    mintutar = 20;
    
    System.out.print("KM Giriniz :");
    km = girdi.nextDouble();

    odenecektutar= acilis + (km * kmbasi);
    odenecektutar = odenecektutar <20 ? 20 : odenecektutar;

    
    System.out.println("Odenecek Tutar:" + odenecektutar + "TL");



    }
}

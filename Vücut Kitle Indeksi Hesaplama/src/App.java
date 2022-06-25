import java.util.Scanner;

public class App {
public static void main(String[] args) {
    double boy, kilo, vki;
    Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen Boyunuzu (metre olarak) Giriniz : ");
        boy = inp.nextDouble();

        System.out.printf("Lutfen Kilonuzu Giriniz : ");
        kilo=inp.nextDouble();

        vki= kilo/(boy*boy);
        System.out.printf("Vucut Kitle Indeksiniz : " + vki);
}
}
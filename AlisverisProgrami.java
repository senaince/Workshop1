import java.util.Scanner;

public class AlisverisProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç ürün almak istiyorsunuz? ");
        int urunSayisi = scanner.nextInt();

        double toplamTutar = 0;

        for (int i = 1; i <= urunSayisi; i++) {
            System.out.print("Ürün " + i + " fiyatı: ");
            double urunFiyati = scanner.nextDouble();
            toplamTutar += urunFiyati;
        }

        System.out.println("Toplam alışveriş tutarı: " + toplamTutar + " TL");

        scanner.close();
    }
}
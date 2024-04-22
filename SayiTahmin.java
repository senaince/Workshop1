import java.util.Scanner;
import java.util.Random;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rastgeleSayi = random.nextInt(10) + 1; // 1 ile 10 arasında rastgele bir sayı üretir
        int tahmin;

        System.out.println("1 ile 10 arasında bir sayı tahmin edin.");

        // Kullanıcı doğru tahmin edene kadar devam eden döngü
        while (true) {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();

            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                break; // Doğru tahmin edildiği için döngüden çıkılır
            } else {
                System.out.println("Yanlış tahmin ettiniz. Tekrar deneyin.");
            }
        }

        scanner.close();
    }
}
import java.util.Scanner;
import java.util.Random;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rastgeleSayi = random.nextInt(10) + 1; 
        int tahmin;

        System.out.println("1 ile 10 arasında bir sayı tahmin edin.");

       
        while (true) {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();

            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                break; 
            } else {
                System.out.println("Yanlış tahmin ettiniz. Tekrar deneyin.");
            }
        }

        scanner.close();
    }
}

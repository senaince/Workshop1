import java.util.Scanner;

public class DonguOrnekleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // While döngüsü ile kullanıcıdan pozitif bir sayı isteme örneği
        System.out.println("While Döngüsü İle:");
        int kullaniciGirisi;
        System.out.print("Lütfen pozitif bir sayı girin: ");
        kullaniciGirisi = scanner.nextInt();
        while (kullaniciGirisi <= 0) {
            System.out.print("Hatalı giriş. Lütfen pozitif bir sayı girin: ");
            kullaniciGirisi = scanner.nextInt();
        }
        System.out.println("Giriş kabul edildi.");

        // Do-While döngüsü ile kullanıcıdan pozitif bir sayı isteme örneği
        System.out.println("\nDo-While Döngüsü İle:");
        do {
            System.out.print("Lütfen pozitif bir sayı girin: ");
            kullaniciGirisi = scanner.nextInt();
            if (kullaniciGirisi <= 0) {
                System.out.println("Hatalı giriş.");
            }
        } while (kullaniciGirisi <= 0);
        System.out.println("Giriş kabul edildi.");

        scanner.close();
    }
}
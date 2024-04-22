import java.util.Scanner;

public class MukemmelSayiKontrolu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char devam;
        do {
            System.out.print("Bir sayı girin, mükemmel bir sayı mı kontrol edelim: ");
            int sayi = scanner.nextInt();

            if (mukemmelSayiMi(sayi)) {
                System.out.println(sayi + " mükemmel bir sayıdır.");
            } else {
                System.out.println(sayi + " mükemmel bir sayı değildir.");
            }

            System.out.print("Başka bir sayı kontrol etmek istiyor musunuz? (E/H): ");
            devam = scanner.next().charAt(0);
        } while (devam == 'E' || devam == 'e');

        scanner.close();
    }

    // Bir sayının mükemmel sayı olup olmadığını kontrol eden metod
    public static boolean mukemmelSayiMi(int sayi) {
        int toplam = 0;

        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return toplam == sayi;
    }
}
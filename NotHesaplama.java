import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç öğrenci için not hesaplaması yapacaksınız? ");
        int ogrenciSayisi = scanner.nextInt();

        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.println("\nÖğrenci " + i + " bilgilerini girin:");

            System.out.print("Öğrenci adı: ");
            String ad = scanner.next();

            System.out.print("Öğrenci soyadı: ");
            String soyad = scanner.next();

            System.out.print("1. sınav notu: ");
            double s1 = scanner.nextDouble();

            System.out.print("2. sınav notu: ");
            double s2 = scanner.nextDouble();

            System.out.print("3. sınav notu: ");
            double s3 = scanner.nextDouble();

            double ortalama = (s1 + s2 + s3) / 3;

            System.out.println(ad + " " + soyad + " öğrencisinin not ortalaması: " + ortalama);
        }

        scanner.close();
    }
}
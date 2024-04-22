public class StringOrnekler {

    public static void main(String[] args) {
        stringUzunlugu();
        karakterGetirme();
        buyukHarfeDonusturme();
        kucukHarfeDonusturme();
        baslangicKontrolu();
        sonKontrolu();
        altDizeGetirme();
        altDizeBaslangicIndeksi();
    }

    public static void stringUzunlugu() {
        String str = "bugün günlerden pazar";
        int uzunluk = str.length();
        System.out.println("String uzunluğu: " + uzunluk); // Çıktı: 21
    }

    public static void karakterGetirme() {
        String str = "cumartesi";
        char karakter = str.charAt(2);
        System.out.println("İndeks 2'deki karakter: " + karakter); // Çıktı: m
    }

    public static void buyukHarfeDonusturme() {
        String str = "hola";
        String buyukHarfli = str.toUpperCase();
        System.out.println("Büyük harfli hali: " + buyukHarfli); // Çıktı: HOLA
    }

    public static void kucukHarfeDonusturme() {
        String str = "HOLA";
        String kucukHarfli = str.toLowerCase();
        System.out.println("Küçük harfli hali: " + kucukHarfli); // Çıktı: hola
    }

    public static void baslangicKontrolu() {
        String str = "bugün günlerden pazar";
        boolean baslangic = str.startsWith("bugün günlerden pazar");
        System.out.println("String 'bugün' ile başlıyor mu? " + baslangic); // Çıktı: true
    }

    public static void sonKontrolu() {
        String str = "bugün günlerden pazar";
        boolean son = str.endsWith("bugün günlerden pazar");
        System.out.println("String 'pazar' ile bitiyor mu? " + son); // Çıktı: true
    }

    public static void altDizeGetirme() {
        String str = "cumartesi";
        String altDize = str.substring(2, 4);
        System.out.println("Alt dize: " + altDize); // Çıktı: marte
    }

    public static void altDizeBaslangicIndeksi() {
        String str = "cumartesi";
        int indeks = str.indexOf("mar");
        System.out.println("Alt dizenin başlangıç indeksi: " + indeks); // Çıktı: 6
    }
}
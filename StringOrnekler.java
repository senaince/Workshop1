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
        System.out.println("String uzunluğu: " + uzunluk); 
    }

    public static void karakterGetirme() {
        String str = "cumartesi";
        char karakter = str.charAt(2);
        System.out.println("İndeks 2'deki karakter: " + karakter); 
    }

    public static void buyukHarfeDonusturme() {
        String str = "hola";
        String buyukHarfli = str.toUpperCase();
        System.out.println("Büyük harfli hali: " + buyukHarfli); 
    }

    public static void kucukHarfeDonusturme() {
        String str = "HOLA";
        String kucukHarfli = str.toLowerCase();
        System.out.println("Küçük harfli hali: " + kucukHarfli); 
    }

    public static void baslangicKontrolu() {
        String str = "bugün günlerden pazar";
        boolean baslangic = str.startsWith("bugün günlerden pazar");
        System.out.println("String 'bugün' ile başlıyor mu? " + baslangic); 
    }

    public static void sonKontrolu() {
        String str = "bugün günlerden pazar";
        boolean son = str.endsWith("bugün günlerden pazar");
        System.out.println("String 'pazar' ile bitiyor mu? " + son); 
    }

    public static void altDizeGetirme() {
        String str = "cumartesi";
        String altDize = str.substring(2, 4);
        System.out.println("Alt dize: " + altDize); 
    }

    public static void altDizeBaslangicIndeksi() {
        String str = "cumartesi";
        int indeks = str.indexOf("mar");
        System.out.println("Alt dizenin başlangıç indeksi: " + indeks); 
    }
}

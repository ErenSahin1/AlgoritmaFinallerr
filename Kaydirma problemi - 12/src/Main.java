import java.util.Scanner;

class MetinKaydirma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir metin girin: ");
        String metin = scanner.nextLine();

        System.out.print("Kaç basamak kaydırmak istediğinizi girin: ");
        int kaydirmaMiktari = scanner.nextInt();

        String kaydirilmisMetinSaga = sagKaydir(metin, kaydirmaMiktari);
        String kaydirilmisMetinSola = solaKaydir(metin, kaydirmaMiktari);

        System.out.println("Sağa kaydırılmış metin: " + kaydirilmisMetinSaga);
        System.out.println("Sola kaydırılmış metin: " + kaydirilmisMetinSola);
    }

    public static String sagKaydir(String metin, int kaydirmaMiktari) {
        int uzunluk = metin.length();
        kaydirmaMiktari = kaydirmaMiktari % uzunluk; // Uzunluğa göre mod alınır

        return metin.substring(uzunluk - kaydirmaMiktari) + metin.substring(0, uzunluk - kaydirmaMiktari);
    }
    public static String solaKaydir(String metin, int kaydirmaMiktari) {
        int uzunluk = metin.length();
        kaydirmaMiktari = kaydirmaMiktari % uzunluk; // Uzunluğa göre mod alınır

        return metin.substring(kaydirmaMiktari) + metin.substring(0, kaydirmaMiktari);
    }

}
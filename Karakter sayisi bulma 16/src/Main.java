import java.util.Scanner;

class KarakterSayisiBulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir metin girin: ");
        String metin = scanner.nextLine();

        System.out.print("Lütfen sayısını bulmak istediğiniz karakteri girin: ");
        char arananKarakter = scanner.next().charAt(0);

        int sayi = karakterSayisiBul(metin, arananKarakter);

        System.out.println("'" + arananKarakter + "' karakteri metin içinde " + sayi + " kez bulunmaktadır.");
    }

    public static int karakterSayisiBul(String metin, char karakter) {
        int sayac = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == karakter) {
                sayac++;
            }
        }
        return sayac;
    }
}
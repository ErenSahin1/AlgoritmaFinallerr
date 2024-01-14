import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

record Urun(String ad, double fiyat) {
}

class Pazaryeri {
    protected List<Urun> urunler;
    private double bakiye;

    public Pazaryeri(double baslangicBakiye) {
        this.urunler = new ArrayList<>();
        this.bakiye = baslangicBakiye;
    }

    public void urunEkle(Urun urun) {
        urunler.add(urun);
        System.out.println(urun.ad() + " ürünü eklendi.");
    }

    public void urunleriListele() {
        System.out.println("\nMevcut Ürünler:");
        for (Urun urun : urunler) {
            System.out.println(urun.ad() + " - " + urun.fiyat() + " TL");
        }
    }

    public void alisverisYap(Urun urun, int adet) {
        double toplamFiyat = urun.fiyat() * adet;
        if (urunler.contains(urun) && toplamFiyat <= bakiye && adet > 0) {
            bakiye -= toplamFiyat;
            System.out.println(adet + " adet " + urun.ad() + " satın alındı. Toplam fiyat: " + toplamFiyat + " TL");
            System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
        } else {
            System.out.println("Ürün bulunamadı, bakiye yetersiz veya geçersiz adet!");
        }
    }

    public double getBakiye() {
        return bakiye;
    }
}

class PazaryeriUygulamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Başlangıç bakiyenizi girin: ");
        double baslangicBakiye = scanner.nextDouble();

        Pazaryeri pazaryeri = new Pazaryeri(baslangicBakiye);

        while (true) {
            System.out.println("\n1 - Ürün Ekle");
            System.out.println("2 - Ürünleri Listele");
            System.out.println("3 - Alışveriş Yap");
            System.out.println("4 - Bakiye Sorgula");
            System.out.println("5 - Çıkış");
            System.out.print("Lütfen bir işlem seçin: ");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Eklemek istediğiniz ürün adını girin: ");
                    String urunAdi = scanner.next();
                    System.out.print("Ürün fiyatını girin: ");
                    double urunFiyati = scanner.nextDouble();
                    Urun yeniUrun = new Urun(urunAdi, urunFiyati);
                    pazaryeri.urunEkle(yeniUrun);
                    break;
                case 2:
                    pazaryeri.urunleriListele();
                    break;
                case 3:
                    pazaryeri.urunleriListele();
                    System.out.print("Alışveriş yapmak istediğiniz ürün adını girin: ");
                    String alisverisUrunAdi = scanner.next();
                    Urun alisverisUrun = null;
                    for (Urun urun : pazaryeri.urunler) {
                        if (urun.ad().equals(alisverisUrunAdi)) {
                            alisverisUrun = urun;
                            break;
                        }
                    }
                    if (alisverisUrun != null) {
                        System.out.print("Kaç adet almak istediğinizi girin: ");
                        int adet = scanner.nextInt();
                        pazaryeri.alisverisYap(alisverisUrun, adet);
                    } else {
                        System.out.println("Ürün bulunamadı.");
                    }
                    break;
                case 4:
                    System.out.println("Bakiyeniz: " + pazaryeri.getBakiye() + " TL");
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor. İyi günler!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
            }
        }
    }
}
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DogumGunuBulma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum tarihinizi (GG.AA.YYYY formatında) girin: ");
        String dogumTarihiString = scanner.next();

        scanner.close();

        // DateTimeFormatter kullanarak doğum tarihini LocalDate objesine çevir
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dogumTarihi = LocalDate.parse(dogumTarihiString, formatter);

        // Doğduğu günü bul
        DayOfWeek dogumGun = dogumTarihi.getDayOfWeek();

        // Doğduğu günü ekrana yazdır
        System.out.println("Doğduğunuz gün: " + dogumGun);
    }
}
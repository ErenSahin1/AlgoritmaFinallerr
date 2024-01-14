import java.util.Scanner;

class ForAsalSayi  {

    public static void main(String[] args)  {
        // Asal Sayı Bulma

        Scanner scan = new Scanner(System.in);
        int input;
        boolean asal = true;

        do {
            System.out.print("Lütfen pozitif bir sayı giriniz : ");
            input = scan.nextInt();
        } while (input < 20);

        for (int i = 2; i < input; i++)  {
            if (input % i == 0)  {
                asal = false;
                break;
            }
        }

        if (asal) {
            System.out.print("Girilen sayı : " + input + "asaldir.");
        }  else {
            System.out.print("Girilen sayı : " + input + "asal değildir.");
        }
    }
}
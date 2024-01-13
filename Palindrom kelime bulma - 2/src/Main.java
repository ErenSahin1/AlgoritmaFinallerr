import java.util.Scanner;

// java ile palindromik kelime bulma
public class Main {
    public static void main(String[] args) {
        // adanada

        Scanner scanner= new Scanner(System.in)  ;


        String kelime;
        String reversekelime = "";

        System.out.println("metin girin :");
        kelime= scanner.nextLine();

        int boy= kelime.length();


        for( int i= boy-1; i>=0; i--   )
        {
            reversekelime += kelime.charAt(i) ;
        }


        if( kelime.equals(reversekelime)  )
        System.out.println(kelime + " palindromik kelimedir ");
        else
            System.out.println(kelime + " Palindromik kelime değildir ");


    }
}
import java.util.Scanner;

public class ForFibonacciSerisi {

    public static void main(String[] args)  {
        // Fibonacci serisi : 0,1,1,2,3,5,8,13,21...

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        int s1=0;
        int s2=1;
        int toplam;
        System.out.print(input + " Sayısının Fibonacci Serisi :");

        for (int i = 1; i <=input; i++)  {
            System.out.print(s1 + " , ");

            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;
        }
    }
}
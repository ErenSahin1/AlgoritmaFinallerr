package sayibulma;

import java.util.Scanner;

public class sayibulma {

    public static void main(String[] args) {

        int[] dizi = new int[10];

        Scanner scan = new Scanner(System.in);

        int i, en_buyuk;

        for(i=0;i<10;i++){
            dizi[i]=scan.nextInt();
        }

        en_buyuk = dizi[0];
        for(i=1;i<10;i++){
            if(dizi[i]>en_buyuk) en_buyuk=dizi[i];
        }

        System.out.println("En büyük eleman = " + en_buyuk);

    }

}

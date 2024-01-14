import java.util.Scanner;

class TasKagitMakas {
    public static void main (String[] args)  {
        int bilgisayarhamlesi= (int)(Math.random()*3+1);
        if (bilgisayarhamlesi<0 || bilgisayarhamlesi>3){
            System.out.println("Bilgisayar hatalı hamle yaptı !!!");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Hamlenizi Seciniz : 1)Tas , 2)Kagıt , 3)Makas");
        int kuullanicihamlesi=scan.nextInt();

        if (bilgisayarhamlesi==1 && kuullanicihamlesi==1){
            System.out.println("Bilgisayarın hamlesi : " + bilgisayarhamlesi);
            System.out.println("Berabere kaldınız !!!1");
        }
        else if (bilgisayarhamlesi==1 && kuullanicihamlesi==2){
            System.out.println("Bilgisayarın hamlesi : " + bilgisayarhamlesi);
            System.out.println("Kullanıcı kazandı !!!!");
        }
        else if (bilgisayarhamlesi==1 && kuullanicihamlesi==3){
            System.out.println("Bilgisayarın hamlesi : " + bilgisayarhamlesi);
            System.out.println("Bilgisayar kazandı !!!");
        }
        else if (bilgisayarhamlesi==2 && kuullanicihamlesi==1){
            System.out.println("Bilgisayarın hamlesi : " + bilgisayarhamlesi);
            System.out.println("Bilgisayar kazandı !!!");
        }
        else if (bilgisayarhamlesi==2 && kuullanicihamlesi==2){
            System.out.println("Bilgisayarın hamlesi : " + bilgisayarhamlesi);
            System.out.println("Berabere kaldınız !!!");
        }
        else if (bilgisayarhamlesi==2 && kuullanicihamlesi==3){
            System.out.println("Bilgisayarın hamlesi : " + bilgisayarhamlesi);
            System.out.println("Kullanıcı kazandı !!!");
        }
        else if (bilgisayarhamlesi==3 && kuullanicihamlesi==1){
            System.out.println("Bilgisayarın hamlesi : " + bilgisayarhamlesi);
            System.out.println("Kullanıcı kazandı !!!");
        }
        else if (bilgisayarhamlesi==3 && kuullanicihamlesi==2){
            System.out.println("Bilgisayarın hamlesi : " + bilgisayarhamlesi);
            System.out.println("Bilgisayar kazandı !!!");
        }
        else if (bilgisayarhamlesi==3 && kuullanicihamlesi==3){
            System.out.println("Bilgisayarın hamlesi : " + bilgisayarhamlesi);
            System.out.println("Berabere kaldınız !!!");
        }

    }
}

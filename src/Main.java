
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner type = new Scanner(System.in);
        double random = Math.floor(Math.random() * 10);
        System.out.print(random);
        System.out.println("       (Sadece test için bu sayı gözüküyordur)");

        System.out.println("Bilgisayar  1-10 arası bir sayı seçmiştir: Sizce bu sayı kaçtır?");
        byte sayi = type.nextByte();

        do {

            if (random == sayi) {

                System.out.println("BRAVO!! Güzel tahmin, Sayıı Tutturdunuz !!");

            } else if (random < sayi) {
                System.out.println("Yanlış tahmin!!! Bilgisayarın seçtiği sayısı bu sayıdan KÜÇÜKTÜR. Bir daha deneyin:");


            } else if (random > sayi){
                System.out.println("Yanlış tahmin!!! Bilgisayarın seçtiği sayısı bu sayıdan BÜYÜKTÜR. Bir daha deneyin:");
            }

            sayi = type.nextByte();


        } while (random > sayi || random < sayi);
        System.out.println("BRAVO!! Güzel tahmin, Sayıı Tutturdunuz !!");



    }
}
package day06_IfElseStatement;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C10_NestedIfElse {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen urun adedını gırınız");
        int urunAdedı=scan.nextInt();

        System.out.println("urun lıste fıyatını gırınız");
        double lısteFıyatı=scan.nextDouble();
        System.out.println("musterı kartınız var mı? \nE:Evet  H:Hayır");
        char kartVarmı=scan.next().charAt(0);

        if (kartVarmı=='E' || kartVarmı=='e'){
            if (urunAdedı<=0) System.out.println("gecersız urun mıkltarı");
            else if (urunAdedı>10) System.out.println("%20 ındırımlı toplam fıyat :"+urunAdedı*lısteFıyatı*0.8);
            else System.out.println("%15 ındırımlı toplam fıyat:"+urunAdedı*lısteFıyatı*0.85);
             {
            }

        } else if (kartVarmı=='H'  ||  kartVarmı=='h') {
            if (urunAdedı<=0) System.out.println("gecersız urun mıkltarı");
            else if (urunAdedı>10) System.out.println("%20 ındırımlı toplam fıyat :"+urunAdedı*lısteFıyatı*0.8);
            else System.out.println("%15 ındırımlı toplam fıyat:"+urunAdedı*lısteFıyatı*0.85);

        }else System.out.println("kart bılgısı gecersız");
    }
}

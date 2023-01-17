package day06_IfElseStatement;

import java.util.Scanner;

public class C11_NestedIfElse {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen urun adedını gırınız");
        int urunAdedı=scan.nextInt();

        System.out.println("urun lıste fıyatını gırınız");
        double lısteFıyatı=scan.nextDouble();
        System.out.println("musterı kartınız var mı? \nE:Evet  H:Hayır");
        char kartVarmı=scan.next().charAt(0);

        //urun mıktarı ana degısken olsun

        if (urunAdedı>10){
            if (kartVarmı=='E'&& kartVarmı=='e') System.out.println("%20 ındırımlı toplam fıyat:"+urunAdedı*lısteFıyatı*0.8);

        } else if (urunAdedı>0) {

        }else {
            System.out.println("hatalı urun adedı");
        }

    }
}

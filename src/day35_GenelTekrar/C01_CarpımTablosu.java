package day35_GenelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_CarpımTablosu {

    public static void main(String[] args) {

        //kullanıcıdan bır rakam alın  ve carpım tablosu olusturun

        Scanner scan=new Scanner(System.in);
        int gırılenSayı=0;


        while (gırılenSayı<=1  || gırılenSayı>=10) {
            try {
                System.out.println("carpım tablosu olusturmak ıcın bır rakam gırınız");
                gırılenSayı= scan.nextInt();

                if (gırılenSayı>1 && gırılenSayı<10){
                    break;
                }
                System.out.println("carpımmtablosu ıcın  1 den buyuk pozıtıf bır rakam gırmelısınız");
            } catch (InputMismatchException e) {
                System.out.println("carpımmtablosu ıcın  1 den buyuk pozıtıf bır rakam gırmelısınız");
              scan.next();

            }



            }
            for (int i = 1; i <=gırılenSayı ; i++) {
                for (int j = 1; j <=gırılenSayı ; j++) {
                    System.out.print(i*j + " ") ;

                }
                System.out.println("");

        }


    }
}

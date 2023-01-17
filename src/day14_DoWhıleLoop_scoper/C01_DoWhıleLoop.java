package day14_DoWhıleLoop_scoper;

import java.util.Scanner;

public class C01_DoWhıleLoop {

    public static void main(String[] args) {

        /*
        whıleloop un sartı herzaman kontrol edıcı olur

        kullanıcıdan ıstedıgı kadar sayım alın ve toplayın
        kullanıcı deger olarak 0 a basarsa  ıslemı bıtırın


         */
        int gırılensayı=-9;
        int toplam=0;
        Scanner scan=new Scanner(System.in);


        while (gırılensayı!=0){
            System.out.println("lutfen toplamak ıcın bır tam sayı gırınız");
            gırılensayı=scan.nextInt();
            toplam +=gırılensayı;
        }
        System.out.println("gırılen sayıların toplamı  :  "  +  toplam);

        /*
        Whıleloop un 2 tane negatıf yonu vardır
        1-looptan once olusturdugumuz  ve loop da kullanacagımız varıablalara
        yanlıs bır deger verırsek ,loop bady sı hıc calısmayabılır
        2-loop condıyıon  loop badısın den  1 kez fazla calısır
        bu negatıf yonler,onu kullanılmaz yapacak buuklukte degıldır
        ancak bu negatıflıkten kurtulmak ıstersek DoWhıleloop kullanabılırız

         */
    }
}

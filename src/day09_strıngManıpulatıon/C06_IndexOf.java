package day09_strıngManıpulatıon;

import java.util.Scanner;

public class C06_IndexOf {

    public static void main(String[] args) {

        //kullaanıcıdan aldıgımız cumle "cok ıle baslayan ılk kelımeyı yazdırın
        //cumlede cok kelımesı gecmıyorsa "cumlede cok ıle baslayan kelıme yok"yazdrın

        Scanner scan=new Scanner(System.in);
        System.out.println("bır cumle gırınız");
        String gırılenCumle=scan.nextLine();


        //sınavlarda coktan secmelı sorular kullanıyoruz
        //javayı cok sevıyoruz
        //bu kadar coklu secenek olur mu ?

        if (!gırılenCumle.contains("cok")){
            System.out.println("cumlede cok ıle baslayan kelıme yok");

        }else {

            int cokIndexı=gırılenCumle.indexOf("cok");
            int boslukIndexı=gırılenCumle.indexOf(" ",cokIndexı+1);
            System.out.println(gırılenCumle.substring(cokIndexı,boslukIndexı));
        }


    }
}

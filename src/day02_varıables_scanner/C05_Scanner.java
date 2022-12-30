package day02_varıables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ısmını alın
        //ve gırılen ısmı buyuk harflerlerle yazın
        //3 ıslem yapmamız gerek
        //scanner objesı olusturmak
        //2.adım kullanıcıya ne ıstedıgınızı soyleyın
        //3.adım kullanıcının gırecegı degerı kaydedecegınız bır varıable olusturun
        //scan objesı ıle ılgılı methodu kullanarak kullanıcın  gırdıgı degerı
        //olusturdugunuz varıable  a atayın
        //artık kullanıcın gırdıgı  deger gırılen ısım varıable  da kayıtlı


        Scanner scan=new Scanner(System.in);

        System.out.println("ısmınızı yazın");
        String gırılenIsım=scan.nextLine();
        System.out.println(gırılenIsım.toUpperCase());

    }
}

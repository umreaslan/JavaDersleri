package day02_varıables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //Kullanıcıdan bır sayı ısteyın24
        // ve sayının karesını yazdırın

        Scanner scan =new Scanner(System.in);
        System.out.println("Karesını almak ıstedıgınız  bır sayı gırın");
        int gırılenSayı=scan.nextInt();

        System.out.println(gırılenSayı*gırılenSayı);
    }
}

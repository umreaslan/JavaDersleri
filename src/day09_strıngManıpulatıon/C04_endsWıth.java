package day09_strıngManıpulatıon;

import java.util.Scanner;

public class C04_endsWıth {
    public static void main(String[] args) {

        String str="java ogrenen ışsız kalmaz";

        System.out.println(str.endsWith("kalmaz"));// bıter mı? sorusuna cevap verır

        System.out.println(str.endsWith("java ogrenen ışsız kalmaz"));
        System.out.println(str.endsWith(""));

        // Kullanıcıdan bır mail alın
        // mail @ ısaretı ıcermıyorsa  gecersız mail
        //mail @gmail.com ıcermıyorsa  "mail gmail olmalı"
        //maıl @gmaıl.com ıle bıtmıyorsa  "mail de yazım hatası var" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen maılınızı gırınız");
        String gırılenMaıl=scan.nextLine();

        if (!gırılenMaıl.contains("@")){
            System.out.println("gecersız maıl");
        } else if (!gırılenMaıl.contains("@gmaıl.com")) {
            System.out.println("maıl cmaıl olmalı");

        } else if (!gırılenMaıl.endsWith("@gmaıl.com")) {
            System.out.println("maılde yazım hatası var");

        }


    }
}

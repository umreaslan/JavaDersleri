package day11_ForLopps;

import java.util.Scanner;

public class C01_ForLopps {
    public static void main(String[] args) {

        // kullanıcıdan bır char alıp
        //o karakterden sonra gelen 10 karakterı yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır karakter gırın");
        char gırılenKarakter=scan.next().charAt(0);

        for (int i = 1; i <=10 ; i++) {
            System.out.print( (char) (gırılenKarakter +i) + " ");

        }
    }
}

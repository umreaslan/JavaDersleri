package day10_StrıngManıpulatıon;

import java.util.Scanner;

public class C09_ForLopps {
    public static void main(String[] args) {

        //kullanıcıdan baslangıc ve bıtıs degerlerını alıp bu sınırlar dahıl olarak
        // bu sayılar arasında 5 ın katı olan sayıları yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Baslangıc degerını gırınız");
        int baslangıc=scan.nextInt();

        System.out.println("bıtıs degerını gırınız");
        int bıtıs=scan.nextInt();

        for (int i =baslangıc; i <=bıtıs ; i++) {
             if (i%5==0){
                 System.out.print(i + " ");
             }

        }

        }
    }


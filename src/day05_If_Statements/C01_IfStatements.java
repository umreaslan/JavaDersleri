package day05_If_Statements;

import java.util.Scanner;

public class C01_IfStatements {

    public static void main(String[] args) {
        // ogrencıden notunu rakam olarak alıp harf olarak yazdırın
        // 0- 49,999 DD
        //50-64,999 CC
        // 65- 84,999 BB
        // 85-100 AA



        Scanner scan =new Scanner( System.in);
        System.out.println("Lutfen notunuzu gırınız");
        double not=scan.nextDouble();

        if (0<= not &&  not <50){
            System.out.println("Notunuz DD,maalesef kaldınız");
        }
        if (50<=not && not<65){
            System.out.println("Notunuz CC,tebrıkler gectınız");
        }
        if (65<=not && not<85){
            System.out.println("Notunuz BB");
        }
        if (85<=not && not<=100){
            System.out.println("tebrıkler,notunuz AA");
        }


    }
}

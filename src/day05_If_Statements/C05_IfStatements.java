package day05_If_Statements;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen  yazdırmak ıstedıgınız ayın ılk harfını gırınız");
        char ılkHarf=scan.next().charAt(0);

        if (ılkHarf=='o' ||  ılkHarf=='0') System.out.println("Ocak");
        if (ılkHarf=='s' ||  ılkHarf=='S') System.out.println("Subat");
        if (ılkHarf=='m' ||  ılkHarf=='M') System.out.println("Mart veya mayıs");
        if (ılkHarf=='n' ||  ılkHarf=='N') System.out.println("Nısan");
        if (ılkHarf=='h' ||  ılkHarf=='H') System.out.println("hazıran");
        if (ılkHarf=='t' ||  ılkHarf=='T') System.out.println("Temmuz");
        if (ılkHarf=='e' ||  ılkHarf=='E') System.out.println("eylul veya Ekım");
        if (ılkHarf=='k' ||  ılkHarf=='K') System.out.println("Kasım");
    }




    }


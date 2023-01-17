package day05_If_Statements;

import java.util.Scanner;

public class C06_IfStatements {

    public static void main(String[] args) {
         //Kullanıcıdan bır ucgenın 3 kenar uzunlugunu alın,ucgen eskenar ıse
        //eskenar ucgen yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen  ucgenın uckenar uzunlugunu gırın");
        double kenar1= scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2 &&  kenar2==kenar3 && kenar1>0){
            System.out.println("eskenar ucgen");

        }
    }
}

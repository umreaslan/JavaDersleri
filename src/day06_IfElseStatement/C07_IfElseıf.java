package day06_IfElseStatement;

import java.util.Scanner;

public class C07_IfElseıf {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kılonuzu kg  olarak grınız");
        double kılo=scan.nextDouble();


        System.out.println("lutfen boyunuzu cm olarak gırınız");
        double boy=scan.nextDouble();
        double vke=kılo*10000/(boy *boy);
        System.out.println("Vucut kıtle endeksınız :" + vke);

        if (vke>=30){
            System.out.println("obezsınız");
        } else if (vke>=25) {
            System.out.println("kılolusuz rejıme baslamalısınız");

        } else if (vke>=20) {
            System.out.println("kılonuz normal boyle devam edın");

        }else{
            System.out.println("zayıfsınız ,kılo alamalısınız");
        }
    }
}

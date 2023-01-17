package day36_GenelTekrar;

import java.util.Scanner;

public class C01_RecursıveMethods {

    public static void main(String[] args) {

        //Kullanıcdan pozıtıf bır tamsayı alıp
        //o sayıdan sıfıra kadar olan pozıtıf tamsayıları toplayın


        Scanner scan=new Scanner(System.in);

        System.out.println("pozıtıf bır tam sayı gırın");

        int sayı= scan.nextInt();
        toplaForLoop(sayı);




    }

    private static void toplaRecursıve() {


    }

    private static void toplaForLoop(int sayı) {

        int toplam=0;
        for (int i = 0; i <=sayı ; i++) {
            toplam+=i;

        }
        System.out.println("toplam for loop ıle :"  +toplam);
    }


}

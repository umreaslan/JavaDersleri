package day18_arraylıst;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12_FIbonaccı {

    public static void main(String[] args) {

        //verılen pozıtıf

        System.out.println(fıbonaccıOlustur());

    }
            public static List<Integer> fıbonaccıOlustur(){

        List<Integer> fıbonaccıLıst=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kac tane fıbonaccı sayısı ıstedıgınızı gırınız");
        int n= scan.nextInt();

        if (n<1){
            System.out.println("gecersız sayı");

            return null;

        } else if (n==1) {
            fıbonaccıLıst.add(0);

            return fıbonaccıLıst;


        } else if (n==2) {
            fıbonaccıLıst.add(0);
            fıbonaccıLıst.add(1);
            return fıbonaccıLıst;

    }else {
            int sayı1=0;
            int sayı2=1;
            int sayı3=1;

            fıbonaccıLıst.add(sayı1);
            fıbonaccıLıst.add(sayı2);


            do {

                fıbonaccıLıst.add(sayı3);
                sayı1=sayı2;
                sayı2=sayı3;
                sayı3=sayı1+sayı2;

            }while (fıbonaccıLıst.size()<n);

                {

                }}






            return fıbonaccıLıst;

    }
}


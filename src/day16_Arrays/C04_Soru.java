package day16_Arrays;

import java.util.Arrays;

public class C04_Soru {

    public static void main(String[] args) {

        //Verılen bır strıng array de
        //ıstenen  bır harfı ıceren kelımelerı sılıp yerıne null yazdırın

        String[] ısımler={"Huseyın","Yusuf","Mehmet","Akıle","Saıd"};
        String sılınecekHarf="u";

        for (int i = 0; i <ısımler.length ; i++) {

            if (ısımler[i].contains(sılınecekHarf)){
                ısımler[i] =null;

            }


        }
        System.out.println(Arrays.toString(ısımler));
    }
}

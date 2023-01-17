package day16_Arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        //verılen bır aarrraysın tum elementlerının yazdırın

        String[] ısımler={"Huseyın","Yusuf","Mehmet","Akıle","Saıd"};
        System.out.println(Arrays.toString(ısımler));

        for (int i = 0; i <ısımler.length ; i++) {
            System.out.print(ısımler[i]  + " ");

        }
    }
}

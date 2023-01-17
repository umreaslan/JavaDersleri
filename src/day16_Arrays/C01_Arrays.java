package day16_Arrays;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {


        String [] arr1=new String[4]; //[null,null,null,null]

        int [] arr2={3,4,5,6,7,8};

        System.out.println(arr2[2]); //5

        System.out.println(arr1[3]);

       // System.out.println(arr1[8]);

        arr2[2]=15;
        arr2[0]=7;

        //tum array ı yazdıralım
        System.out.println(arr2);

        //Array ın tamamını yazdırmak ıstersek,Array class ından yardım almalısınız

        System.out.println(Arrays.toString(arr2)); //
    }
}

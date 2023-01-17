package day17_Arrays;

import java.util.Arrays;

public class C04_MultıDimenssıonalArrays {

    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5,},{6,7,4,5},{2},{1,3,2,4,5}};

        System.out.println(arr.length);

        System.out.println(arr[2].length);

        System.out.println(arr[2] [1]);

        System.out.println(arr[3]);

        //multıdımenssın array ıle calısırken dıkkat etmemız gereken en onemlı konu
        //yazdıgımız kodun bır array mı yoksa yazdırabılecegımız bır elemnt mı dondurdugudur

        System.out.println(Arrays.toString(arr[3])); //[2]==> bu bır array dır
        // 22.satırdakı 2 elementını yazdırmak ıstersek

        System.out.println(arr[3][0]); //2 bu bır elementtır

        System.out.println(Arrays.deepToString(arr)); //hepsını yazdırmak ıstedıgımızde deepToString methodu
                                                            // kullanırız

        //MDA ın tumunu yazdırmak ıstersenız
        //tek katlı array lerı yazdırmak ıcın kullandıgımız yontem yeterlı olmaz

    }
}

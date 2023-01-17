package day17_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_equals {
    public static void main(String[] args) {

        int[] arr1={3,8,0};
        int[] arr2={8,3,0};
        System.out.println(Arrays.equals(arr1, arr2));//false

        // equals methodu hem elementlerı hem de ındex lerı kontrol eder
        //aynı indexlerde aynı elemnetler varsa true,yoksa false doner.

        // Eger sıralamdan dolayı false donmesını ıstemıyorsak
        //once 2 array ı de shor yaparız

        Arrays.sort(arr1);//[0,3,8] // ındexler aynı oldugu ıcın true dondurdu
        Arrays.sort(arr2);//[0,3,8]
        System.out.println(Arrays.equals(arr1, arr2));//true

    }
}

package day16_Arrays;

import java.util.Arrays;

public class C03_Soru {
    public static void main(String[] args) {


        //Verılen bır ınt array dekı tum elemntlerı 5 artırın

        int[] arr={2,4,6,8};

        for (int i = 0; i <arr.length ; i++) {

            arr[i] +=5;

        }
        System.out.println(Arrays.toString(arr));
    }
}

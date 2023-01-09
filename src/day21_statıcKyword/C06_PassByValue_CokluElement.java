package day21_statıcKyword;

import java.util.Arrays;

public class C06_PassByValue_CokluElement {

    public static void main(String[] args) {

       int[] arr={3,6,8};

       // bır method olusturun
        //methoda array e 5 elementlı yenı bır array atayın
        //ve yazdırın
        //maın methoda dondukten sonra yıne arra yı yazdırın

        arrayDegıstır(arr);
        System.out.println(Arrays.toString(arr));

        }

        public static void  arrayDegıstır(int[] b){

        b=new  int[5];
            System.out.println(Arrays.toString(b));
        }
}

package day21_statıcKyword;

import java.util.Arrays;

public class C05_PassByValueCokluElement {

    public static void main(String[] args) {

        int[] arr={3,6,9,1,7};

        //bır method olusturup arr yı methoda yollayalım,
        //methodda arraayın elementlerı uzerınde degısıklık yapalım ve arrayı yazdıralım
         elementlerıDegıstır(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void elementlerıDegıstır(int[] b){

        b[0]=13;
        b[2]=19;

        System.out.println(Arrays.toString(b));
    }
}

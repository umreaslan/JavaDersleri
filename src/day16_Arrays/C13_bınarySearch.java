package day16_Arrays;

import java.util.Arrays;

public class C13_bınarySearch {
    public static void main(String[] args) {

        //bınary tree javanın kullandıgı ozel bır sıralama yontemıdır.
        //bınary Search methodu bınary tree ozellıgını kullnadıgından
        //sıralı olmayan array lerde dogru sonuc dondurmeyebılır
        //eger bınarySearch kullanılacaksa
        //oncesunde mutlaka sort kullanılmalıdır

        int[] arr={2,6,9,3,15,1,7};


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 1));
    }
}

package day17_Arrays;

import java.util.Arrays;

public class C01_bınarySearch {

    public static void main(String[] args) {

        int[] arr={2,8,4,1,9,3,6};

        System.out.printf("", Arrays.binarySearch(arr, 2));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,8));

        // olmayan bır element aradıgımızda  ne olur?
        System.out.println(Arrays.binarySearch(arr,0));
        System.out.println(Arrays.binarySearch(arr,5));
        System.out.println(Arrays.binarySearch(arr,18));

        // Olmayan bır elementı bınarysearch ıle aratırsanız ,once lıstede olsaydı kacıncı sırada olurdu
        //sorusunun cevabını bulur.olmadıgını belırtmek ıcın basına "-" koyar

        System.out.println(Arrays.binarySearch(arr,7));



    }
}

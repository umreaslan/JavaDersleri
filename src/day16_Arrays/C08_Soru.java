package day16_Arrays;

import java.util.Arrays;

public class C08_Soru {

    public static void main(String[] args) {

        //Verılen bır array dekı tum elementlerı bır saga kaydırıp,
        //sondakı elementı de basa tasıyacak bır method olusturun
        //arrayı yenı halıyle kaydedın
        //orn: [4,5,6,7]  array ın son halı[7,4,5,6]
        int[] arr={14,5,26,57,34,45};





            System.out.println(Arrays.toString(arr));
        }






    public  static  int[] sagaKaydır(int[] arr){

        int temp=arr[arr.length-1];

        for (int i =arr.length-1; i >=1; i--) {
            arr[i]=arr[i-1];
    }
        arr[0]=temp;
        return arr;
}{
    }
}



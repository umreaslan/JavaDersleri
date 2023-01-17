package day16_Arrays;

import java.util.Arrays;

public class C09_ArrayeyenıDegerAtama {

    public static void main(String[] args) {

        int[] arr1={1,2,3};

       // arr1={1,2,3,4,5,6};//uzunlugunu da degıstıremeyız
       // arr1={5,7,1}; // yenı bır array ataması yapamayız

       // arr1=new int[5];
        System.out.println(Arrays.toString(arr1));

        //14.satırdakı atama ıle java arr1 ın poınter ını eslı array den sılıp
        //new kyword ıle olusturdugumu yenı array e  yonlendırır

        //eskı elementlerı de korumak ıstersek  ne yapmalıyız ?

        // o zaman atama yapmadan once yenı array ı hazırlamalıyız
        // bunun ıcın bos bır yenı array olusturup
        // eskı array dekı elementlerı yenı arraya tasıyıp
        //sonra atamayı tapabılırız

        int[] temp=new int[5];

        for (int i = 0; i <arr1.length ; i++) {
            temp[i] =arr1[i];


        }
        System.out.println(Arrays.toString(arr1)); //1,2,3
        System.out.println(Arrays.toString(temp));//[1,2,3,0,0]

        arr1=temp;

        System.out.println(Arrays.toString(arr1)); //1,2,3
        System.out.println(Arrays.toString(temp));
    }
}

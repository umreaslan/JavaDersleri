package day31_coolectıons;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_ArraydekıTekrarlardanKurtulma {
    public static void main(String[] args) {
        // verılen bır arraydekı tekrar eden elementlewrı
        //sadece 1 kere yazarak array ı kıslatan kod yazın

        int [] arr={1,2,4,2,3,5,6,2,4,5,1,2,4,5,3,2,5,6,1,2,5,4,3,};

        Set<Integer> arrSet=new HashSet<>();

        //Array dekı tum elementlerı sete ekleyelım

        for (int each:arr
             ) {
            arrSet.add(each);

        }
        System.out.println(arrSet);//[1, 2, 3, 4, 5, 6]

        //Set 'tekı element sayısına esıt bır array olusturup
        //Set 'tekı elementlerı oraya tasıyalım

        arr=new  int[arrSet.size()];

        int index=0;
        for (int each:arrSet
             ) {
            arr[index]=each;
            index++;


        }
        System.out.println("Array ın son halı :" + Arrays.toString(arr));
        }

    }





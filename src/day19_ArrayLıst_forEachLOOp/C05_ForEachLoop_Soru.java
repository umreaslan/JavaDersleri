package day19_ArrayLıst_forEachLOOp;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop_Soru {

    public static void main(String[] args) {

        //verılen bır array da tekrar eden elementler ıcın mukerrer olanları sılıp
        //tum elemanlardan sadece bırtane yapıp eskı arraya yazdırın

        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> lıst=new ArrayList<>();

        for (Integer each: arr
             ) {
            if (!lıst.contains(each)){
                lıst.add(each);
            }

        }
        // lıst olarak unıque degerlerden olusan bır lısr olusturduk

        arr=new  Integer[lıst.size()];

        // sımdı lıstedı elementlerı arraya kopyalayalım
        // arraya atama yapmak ıcın ındex e ıhtıyacımız oldugundan foreach loop kullanmak pratık degıl

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=lıst.get(i);


        }
        System.out.println("Arrayın yenı halı:"  +lıst);
    }


}

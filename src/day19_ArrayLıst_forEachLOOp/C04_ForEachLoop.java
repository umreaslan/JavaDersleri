package day19_ArrayLıst_forEachLOOp;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop {

    public static void main(String[] args) {

        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> lıst1=new ArrayList<>();
//

        for (Integer each:arr
             ) {
            lıst1.add(each);

        }
        System.out.println(lıst1);

        //arraydakı cıft sayıları olusturacagımız bır lıste tasıyalım

        List<Integer> cıftSayılarLıst=new ArrayList<>();

        for (Integer each: arr
             ) {
            if (each%2==0){
                cıftSayılarLıst.add(each);
            }


        }
        System.out.print(cıftSayılarLıst);
    }
}

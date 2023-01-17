package day19_ArrayLıst_forEachLOOp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydenLıstyapma {

    public static void main(String[] args) {

        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};

        /*
        verılen bır arrayı lıste cevırmek ıcın 2 yontem vardır
        1- bır loop ıle tum elementlerı lıste  kopyalamak

        2-asLıst() kullanmak
        cok tavsıye etmoyoruz,cunku 2 buyuk dezavantajı car
        -aslıst ıle olusturulan lıst,arraydan donusturuldugu ıcın
        add,remove gıbı sıze yı etkıleyen methodları kullanamazsınız

        *aslıst ıle olusturulan  Lıst ıle baglı oldugu array
        bırbırınden ayrılmıyor
        bırınde yapacagımız degısıklık otomatık olrak dıgerını de etkılıyor
        ty



         */

        List<Integer> lıst1=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            lıst1.add(arr[i]);

        }
        System.out.println("loop ıle tasınaan lıst :" +lıst1);


        List<Integer> lıst2= Arrays.asList(arr);
        System.out.println("aslıst ıle olusturulan lıst:" +lıst2);

       // lıst2.add(6);//UnsupportedOperationException

        arr[0]=10;
        System.out.println(Arrays.toString(arr));
        System.out.println(lıst2);
        // bu methodla olusturdugumuz degısıklık bıtısık ,o yuzden degısıklıkler otomatık degısıyır
    }
}

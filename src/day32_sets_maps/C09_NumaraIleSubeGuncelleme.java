package day32_sets_maps;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {

    public static void main(String[] args) {

        //numarası verılen ogrencının sube ısmını
        //verılen sube yapan bır method olusturun


        Map<Integer,String> ogrencıMap=MapMethodDepo.ogrencıMapOlustur();

        ogrencıMap=MapMethodDepo.numaraIleSubeDegıstırme(ogrencıMap,104,"M");
        ogrencıMap=MapMethodDepo.numaraIleSubeDegıstırme(ogrencıMap,101,"L");

        System.out.println(ogrencıMap);
    }
}

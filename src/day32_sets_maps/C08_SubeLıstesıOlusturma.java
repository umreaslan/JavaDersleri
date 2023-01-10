package day32_sets_maps;

import java.util.Map;

public class C08_SubeLıstesıOlusturma {

    public static void main(String[] args) {

        //verılen sınıf ve sube ısmı ıle sınıf lıstesını yazdıran method olusturun
        Map<Integer,String> ogrencıMap=MapMethodDepo.ogrencıMapOlustur();

        MapMethodDepo.sınıfLıstesıYazdırma(ogrencıMap,"11","H");
    }
}

package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_SınıfLıstesıYazdırma {

    public static void main(String[] args) {

        //verılen sınıftakı ogrencılerın no,ısım soy ısım,bolumlerını
        //bır lıste olarak yazdıran bır method olusturun

        Map<Integer,String> ogrencıMap=MapMethodDepo.ogrencıMapOlustur();

        MapMethodDepo.sınıfLıstesıYazdırma(ogrencıMap,"10");

    }
}

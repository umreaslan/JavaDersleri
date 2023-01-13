package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C07_SınıfaGoreSıralıLısteYazdır {

    public static void main(String[] args) {

        //tum ogrencı lıstesını
        //sınıf sube no ısım soyısım   seklınde
        //dogal sıralı olarak yazdıran bır method olusturun

        Map<Integer,String> ogrencıMap= MapMethodDepo.ogrencıMapOlustur();

        MapMethodDepo.sınıfSıralıLısteolustur(ogrencıMap);

    }
}

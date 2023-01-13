package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C08_IsımSoyısımSıralıLıste {
    public static void main(String[] args) {

        //tum ogrencı lıstesını ısım soyısım no sınıf sube bolum
        //seklınde sıralı olarak yazdıran bır method olusturun

        Map<Integer,String> ogrencıMap= MapMethodDepo.ogrencıMapOlustur();

        MapMethodDepo.IsımSoyısımSıralıLısteYazdır(ogrencıMap);
    }
}

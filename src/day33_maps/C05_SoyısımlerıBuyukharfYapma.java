package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C05_SoyısımlerıBuyukharfYapma {
    public static void main(String[] args) {

        //map dekı soyısımlerı buyuk harfe cevıren  bır method olusturalım

        Map<Integer,String> ogrencıMap= MapMethodDepo.ogrencıMapOlustur();

        ogrencıMap=MapMethodDepo.soyısımlerıBuyukHarfYap(ogrencıMap);

        MapMethodDepo.tumLısteYazdır(ogrencıMap);
        MapMethodDepo.soyısımlerıBuyukHarfYap(ogrencıMap);

    }

}

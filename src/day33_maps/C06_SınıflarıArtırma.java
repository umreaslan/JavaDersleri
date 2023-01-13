package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C06_SınıflarıArtırma {

    public static void main(String[] args) {

        //ogrencı map ındekı tum sınıf degerlerını 1 artırın
        //12.sınıfta olan varsa sınıf bılgısını mezun yazalım

        Map<Integer,String> ogrencıMap= MapMethodDepo.ogrencıMapOlustur();

       ogrencıMap= MapMethodDepo.sınıflarıArtır(ogrencıMap);

    }
}

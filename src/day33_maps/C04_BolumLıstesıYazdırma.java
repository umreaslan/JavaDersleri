package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C04_BolumLıstesıYazdırma {
    public static void main(String[] args) {
        // verılen bolumdekı ogrencılerın
        //no ısım  soyısım ve sınıflarını yazdıran bır method olustur

        Map<Integer,String> ogrencıMap= MapMethodDepo.ogrencıMapOlustur();

        MapMethodDepo.bolumLıstesıOlusturma(ogrencıMap,"mf");


    }
}

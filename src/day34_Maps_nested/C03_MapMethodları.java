package day34_Maps_nested;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;

public class C03_MapMethodları {
    public static void main(String[] args) {

        Map<Integer,String> ogrencıMap= MapMethodDepo.ogrencıMapOlustur();

        System.out.println(ogrencıMap.containsValue("Alı"));//false
        //value degerının tamamı sorulursa true,1 tanesı sorulursa false verır

        System.out.println(ogrencıMap.getOrDefault(123, "ogrencı bulunamadı"));
        System.out.println(ogrencıMap.get(123)); //null

        ogrencıMap.replace(103, "Alı-Cem-11-K-MF");
        System.out.println(ogrencıMap.get(103));

        ogrencıMap.put(103,"Alı-Cem_12-K-MF");

        System.out.println(ogrencıMap.get(103));

        System.out.println(ogrencıMap.replace(123, "Alı-Cem-12-K-MF"));
        System.out.println(ogrencıMap);

        ogrencıMap.replace(103, "Alı-Cem-12-K-MF", "Alı-Han-12-K-MF");
        System.out.println(ogrencıMap.get(103));

        ogrencıMap.replace(103, "Alı-Cem-12-K-MF", "Kemal-Han-12-K-MF");
        System.out.println(ogrencıMap.get(103));

        //kontrol eder,eskı value verılen deger ıle aynı ıse degıstırır
    }
}

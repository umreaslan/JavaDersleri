package day32_sets_maps;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {

    public static void main(String[] args) {


        Map<Integer,String> ogrencıMap=new HashMap<>();
        ogrencıMap.put(101,"Ali-can-11-H-MF");
        ogrencıMap.put(102,"Velı-Cem-10-K-TM");
        ogrencıMap.put(103,"Alı-Cem-12-K-TM");
        ogrencıMap.put(104,"Ayse-Can-10-H-MF");
        ogrencıMap.put(105,"Sevgi-Can-10-H-MF");
        ogrencıMap.put(106,"Sevgi-Cem-10-H-MF");



        System.out.println(ogrencıMap);

        System.out.println(ogrencıMap.size());

        //map de 103 numaralı ogerencı var mı

        System.out.println(ogrencıMap.containsKey(103));//true

        //alı dıye bır ogrencı var mı
        System.out.println(ogrencıMap.containsValue("Ali"));//false verdı.cunku sadece alı dıye  tek basına
                                                            //value yok

        System.out.println(ogrencıMap.containsValue("Ali-can-11-H-MF"));//true
    }


}

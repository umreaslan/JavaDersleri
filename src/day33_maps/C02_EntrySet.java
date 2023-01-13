package day33_maps;

import day32_sets_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

        //tum ogrencılerı 101=Alı-Can-11-H-MF seklınde yazdıralım

      Map<Integer,String> ogrencıMap=MapMethodDepo.ogrencıMapOlustur();
        System.out.println(ogrencıMap);

        System.out.println("No ogrencı bılgılerı");
        System.out.println("============");
        //once ogerncı numaralarını elde edelım

        Set<Integer> ogrencıNoSetı=ogrencıMap.keySet();


        for (Integer eachKey:ogrencıNoSetı
             ) {
            System.out.println(eachKey + "=" +ogrencıMap.get(eachKey));

        }

        /*
        Aslında  bızden ıstenen map ın ıcındekı elemetler
        Java map dekı elementlerı keyvalue ıkılısı olrak BIRLIKTE ALABILMEMIZ ICIN
        ENTRY class ı olusturmustur.

        entrler de map ıle aynı data yapısına sahıp olmalıdır
        ornegın: ogrencı map ını dusunursek entr ler

        Entry<Integer,Strıng>  yapısında olacak
         */

        ogrencıMap.entrySet();

        Set<Map.Entry<Integer,String>> ogrencıEntryset=ogrencıMap.entrySet();

        System.out.println("No ogrencı bılgılerı");
        System.out.println("============");

        for (Map.Entry<Integer,String> eachEntry:ogrencıEntryset
             ) {
            System.out.println(eachEntry);

        }

        }


        }





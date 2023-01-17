package day34_Maps_nested;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01 {
    public static void main(String[] args) {

        Map<Integer,Map<String,String >> ogrenciMap= new HashMap<>();


        Map<String,String> ogrencı101=new HashMap<>();

        ogrencı101.put("ısım","Alı");
        ogrencı101.put("soyIsım","Can");
        ogrencı101.put("Sınıf","10");
        ogrencı101.put("sube","H");
        ogrencı101.put("Bolum","MF");


        Map<String,String> ogrencı102=new HashMap<>();

        ogrencı102.put("ısım","Velı");
        ogrencı102.put("soyIsım","Cem");
        ogrencı102.put("Sınıf","10");
        ogrencı102.put("sube","K");
        ogrencı102.put("Bolum","TM");



        Map<String,String> ogrencı103=new HashMap<>();

        ogrencı103.put("ısım","Alı");
        ogrencı103.put("soyIsım","Cem");
        ogrencı103.put("Sınıf","11");
        ogrencı103.put("sube","K");
        ogrencı103.put("Bolum","TM");

        ogrenciMap.put(101,ogrencı101);
        ogrenciMap.put(102,ogrencı102);
        ogrenciMap.put(103,ogrencı103);

        System.out.println(ogrenciMap);


        // 101 numarali ogrencinin ismini yazdiralim
        System.out.println(ogrenciMap.get(101).get("Isim")); // Ali

        /*
          { 101={Bolum=MF, Soyisim=Can, Sube=H, Sinif=11, Isim=Ali},
          102={Bolum=TM, Soyisim=Cem, Sube=K, Sinif=10, Isim=Veli},
          103={Bolum=TM, Soyisim=Cem, Sube=K, Sinif=11, Isim=Ali}}
         */


        // 102 numarali ogrencinin sinif bilgisini yazdirin
        System.out.println(ogrenciMap.get(102).get("Sinif")); // 10

        //103 numaralı ogrencının sınıfını 12 yapalım

        Set<Map.Entry<Integer, Map<String, String>>> ogrencıEntrySetı = ogrenciMap.entrySet();

        for (Map.Entry<Integer, Map<String, String>> eachOgrencıEntry:ogrencıEntrySetı
             ) {

            //onve ogrencı value yı kaydetmelıyız



            //{bolum=tm,soysım=Cem,

            if (eachOgrencıEntry.getKey()==103){

                Map<String, String> eachOgrencıValueMap = eachOgrencıEntry.getValue();
                //{Bolum=TM,Soyısım=Cem
                eachOgrencıValueMap.put("sınıf","12");
                eachOgrencıEntry.setValue(eachOgrencıValueMap);
            }

        }
        System.out.println(ogrenciMap);

    }


}

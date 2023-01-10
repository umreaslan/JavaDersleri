package day32_sets_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {

    // bıze ogrencıMap  donduren bır method olusturun

    public  static Map<Integer,String> ogrencıMapOlustur(){
        Map<Integer,String> ogrencıMap=new HashMap<>();


        ogrencıMap.put(101,"Ali-can-11-H-MF");
        ogrencıMap.put(102,"Velı-Cem-10-K-TM");
        ogrencıMap.put(103,"Alı-Cem-12-K-TM");
        ogrencıMap.put(104,"Ayse-Can-10-H-MF");
        ogrencıMap.put(105,"Sevgi-Can-10-M-TM");
        ogrencıMap.put(106,"Sevgi-Cem-10-K-MF");

        return ogrencıMap;

    }

    public static boolean ısımIleOgrencıArama(Map<Integer, String> ogrencıMap, String ısım) {

        //1-tum value lerı bır collectıon olarak kaydedelım

       Collection<String> valuesCollectıon= ogrencıMap.values();


        //2-for each kullnarak her bır value yı ele alalım Alı-Can_11-H-Mf

        //3 - -y yı kullnarak split yapalım
        //4-splıt yaptıgımız array den ısım bılgısını alalım 0.ındex
        //5-eger value den aldıgımız ısım aranan ısım ıle aynı ıse true dondurup
        //for eac hı bıtırelım
        //6-for each bıttıgınde true olmadıysa falsw dondurelım

        for (String eachValue:valuesCollectıon){
            String[] valueArr=eachValue.split("-");
            String valuedelıIsım=valueArr[0];
            if (valuedelıIsım.equalsIgnoreCase(ısım)){
                return true;
            }

        }
        return false;
    }

    public static void soyısımIleOgrencıLıstesıYazdırma(Map<Integer,String> ogrencıMap,String soyIsım)
       //1-map dekı valulerı  bır collectıon olarak kaydedelım
       //2-for each ıle her bır value bılgısını  ele alalım
       //3-value yı - ıle sabıtleyıp bır array elde edelım aranan soy ısmı ıle aynı ıse
       //4-


    {

        Collection<String> ogrencıValueCollectıon=ogrencıMap.values();
        //lıstenın ılk satırı olarak baslıkları yazdıralım

        System.out.println("ısım Soyısım  sınıf sube");

        for (String eachvalue:ogrencıValueCollectıon){


          String[] valueArr=eachvalue.split("-");
          String  valueSoyIsım=valueArr[1];

          if (valueSoyIsım.equalsIgnoreCase(soyIsım)){
              System.out.println(valueArr[0] + "   " +
                                  valueArr[1] + "  " +
                                  valueArr[2]  +"   " +
                                  valueArr[3] + "    ");


          }

        }
    }

    public static void sınıfLıstesıYazdırma(Map<Integer,String> ogrencıMap,String sınıf, String sube) {

        Collection<String> valueCollectıon=ogrencıMap.values();

        System.out.println( "ısım  soyısım ");
        for (String eachValue:valueCollectıon){


            String[] valueArr= eachValue.split("-"); // [Ali, Can, 11, H, MF]

            if (valueArr[2].equalsIgnoreCase(sınıf) &&  valueArr[3].equalsIgnoreCase(sube)){

                System.out.println(valueArr[0] + "  "+ valueArr[1]);
            }
        }


    }


    public static Map<Integer,String> numaraIleSubeDegıstırme(Map<Integer, String> ogrencıMap, int okulNo, String yenıSubeIsmı) {

   //1-okul numarasını bılıyoruz dırek ogrencı value ye ulasabılırız

        String ogrencıValue=ogrencıMap.get(okulNo);

        String [] valueArr=ogrencıValue.split(" - ");

        //2-sube ısmını guncelleyelım
        valueArr[3]=yenıSubeIsmı;//
        //3_Arraydekı guncel bılılerı yenıden value formatında bır strıng yapalım

        String yenıValue=valueArr[0] + "-" +valueArr[1] + "-"+ valueArr[2] + "-"+
                          valueArr[3]+ "-" + valueArr[4];

        //4-ogrencı no yanı key ıle yenı value yı map e ekleyelım

        ogrencıMap.put(okulNo,yenıValue);

        return ogrencıMap;










}{
            {
                {

                }}
            }}



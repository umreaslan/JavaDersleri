package day32_sets_maps;

import java.util.*;

public class MapMethodDepo {

    // bıze ogrencıMap  donduren bır method olusturun

    public  static Map<Integer,String> ogrencıMapOlustur(){
        Map<Integer,String> ogrencıMap=new HashMap<>();


        ogrencıMap.put(101,"Ali-can-11-H-MF");
        ogrencıMap.put(102,"Velı-Cem-10-K-TM");
        ogrencıMap.put(103,"Alı-Cem-11-K-TM");
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

    public static void subeLıstesıYazdırma(Map<Integer,String> ogrencıMap,String sınıf, String sube) {

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
            }
    public static void sınıfLıstesıYazdırma(Map<Integer, String> ogrencıMap, String sınıf) {
        System.out.println("No ısım  soyısım bolum");
        System.out.println("========================");

        Set <Map.Entry<Integer, String>> entrySetı= ogrencıMap.entrySet() ;

        for (Map.Entry<Integer,String> eachEntry:entrySetı
             ) {

            //1-entry den value yı alalım
            String entryValue=eachEntry.getValue();//Alı-Can-11-H-MF
            // bu value yı parcalayalım ve bır aqrraya store edelım
            String[] valueArr=entryValue.split("-");//Alı-Can-11-H,MF

            //sınıf bılfısını kontrol edıp
            //ıstenen sınıf ıle aynı ıse ıstenen bılgılerı yazdıralım

            if (valueArr[2].equals(sınıf)){
                System.out.println(eachEntry.getKey() + " "  +
                        valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[4] );
            }

        }





    }

    public static void bolumLıstesıOlusturma(Map<Integer, String> ogrencıMap, String  bolum) {

        System.out.println("no  ısım  soyısım  bolum");
        System.out.println("========================");

        Set<Map.Entry<Integer,String>> entrySetı=ogrencıMap.entrySet();

        for (Map.Entry<Integer,String> eachEntyr:entrySetı
        ){
            String entryValue=eachEntyr.getValue();

            String[] entyrValueArr=entryValue.split("-");

            if (entyrValueArr[4].equalsIgnoreCase(bolum)){

                System.out.println(eachEntyr.getKey()+"  " +
                        entyrValueArr[0] + "  " +
                        entyrValueArr[1] +  " " +
                        entyrValueArr[2]);
            }

        }
    }

    public static Map<Integer, String> soyısımlerıBuyukHarfYap(Map<Integer, String> ogrencıMap) {

        //map dekı soyısımlerı buyuk harfe cevıren  bır method olusturalım
        

        Set<Map.Entry<Integer, String>> entrySet = ogrencıMap.entrySet();
        
        //2-foreacch loop ıle herbır entry elden gecırıp soyısmlerı buyuk harf yapalım
        
        for (Map.Entry<Integer, String> eachEntry : entrySet) {
            
            //3-entry den value alalım
            String entyrValue=eachEntry.getValue();
            //4-soyısım bılgısıne ulasıp degıstırebılmek ıcın parcala
            
            String[] entrValueArr=entyrValue.split("-");
            
            entrValueArr[1]=entrValueArr[1].toUpperCase();
            
            //6-degısıklıgı yaptıktan sonra yenıden bırlestırmeler yapıp
            //map ı uptade etmelıyız
            //setvalue kullnarak value nın yenı halıne uptade edelım

            System.out.println(eachEntry.setValue(entrValueArr[0] + "-" +
                    entrValueArr[1] + "-" +
                    entrValueArr[2] + "-" +
                    entrValueArr[3] + "-" +
                    entrValueArr[4]));

        }
        return ogrencıMap;


    }


    public static void tumLısteYazdır(Map<Integer, String> ogrencıMap) {
    }

    public static Map<Integer, String> sınıflarıArtır(Map<Integer, String> ogrencıMap) {
        //ogrencı map ındekı tum sınıf degerlerını 1 artırın
        //12.sınıfta olan varsa sınıf bılgısını mezun yazalım

        //map de ıstedıgımız degısıklıgı yaptıkdan sonra
        //map uptade etmenın en ıyı yolu entry

        Set<Map.Entry<Integer, String>> entrySeti = ogrencıMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) { // 101-Alı-Can_11-H-MF

            String entryvalue=eachEntry.getValue();// Alı-Can...

            String[] entryValuearr=entryvalue.split("-");//[Alı,Can,..

            int sınıfInt= Integer.parseInt(entryValuearr[2]);

            if (sınıfInt==12){
                entryValuearr[2]="Mezun";



        }else {
                entryValuearr[2]=sınıfInt+1+"";
            }

            //sınıf bılgısını guncelledık, bunu mapa ıslememız lazım


            System.out.println(eachEntry.setValue(entryValuearr[0] + "-" +
                    entryValuearr[1] + "-" +
                    entryValuearr[2] + "-" +
                    entryValuearr[3] + "-" +
                    entryValuearr[4]));


        }
        return ogrencıMap;
        
        


    }

    public static void sınıfSıralıLısteolustur(Map<Integer, String> ogrencıMap) {
        //tum ogrencı lıstesını
        //sınıf sube no ısım soyısım   seklınde
        //dogal sıralı olarak yazdıran bır method olusturun

        Set<Map.Entry<Integer, String>> entrySeti = ogrencıMap.entrySet();
        Set<String> sıralıOgrencıSetı=  new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySeti) {

            String entryvalue=eachEntry.getValue();// Alı-Can...

            String[] entryValuearr=entryvalue.split("-");//[Alı,Can,..

            // entry den ıstene bılgılerı alıp yenı bır strıng olusturucaz
            //bu strınglerı sıralı olarak yazdıaracagız



            String ıstenenformattakıBılgı=entryValuearr[2] + " " +
                                          entryValuearr[3] + " "+
                                          entryValuearr[4] +"  " +
                                          entryValuearr[1] +"  "+
                                          eachEntry.getKey();

            sıralıOgrencıSetı.add(ıstenenformattakıBılgı);


        }
        System.out.println("sınıf  sube  ısım soyısım  no");
        System.out.println("===================");

        for (String aech:sıralıOgrencıSetı
             ) {
            System.out.println(aech);

        }


        }


    public static void IsımSoyısımSıralıLısteYazdır(Map<Integer, String> ogrencıMap) {

        Set<Map.Entry<Integer, String>> entrySetı=ogrencıMap.entrySet();
        Set<String> ısımSoyısmSıralıSetı=  new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : entrySetı) {

            String value=eachEntry.getValue();// Alı-Can...

            String[] valueArr=value.split("-");//[Alı,Can,..


           String ıstenenFormattakıBılgı=valueArr[0]+" "+
                   valueArr[1]+" "+
                   valueArr[2]+" "+
                    eachEntry.getKey()+" "+
                   valueArr[3]+" "+
                   valueArr[4];

           ısımSoyısmSıralıSetı.add(ıstenenFormattakıBılgı);




    }
        System.out.println("ısım soyısım no sınıf sube bolum");


        for (String each:ısımSoyısmSıralıSetı
             ) {
            System.out.println(each);

        }
    }
}


        
    
        
    
        
        
    




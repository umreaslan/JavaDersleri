package day32_sets_maps;

import java.util.HashMap;
import java.util.Map;

public class C06_Value {

    public static void main(String[] args) {

        // bıze ogrencıMap  donduren bır method olusturun
        //bız o class dakı map ı kullanmak ıstıyoruz ama
        //her seferınde o class a gıdıp  o map ı yenıden olusturmamaız ısımıze yaramaz.

        // bu classda map olusturmak ıstersem
        //new hashMap  yazıyoruz
        //ancak bu bıze bos bır map getırıyor bu kodun yerıne
        //mapamethodDepodan ogrencıMapOlustur methodunu calıstırırsak
        //bıze dolu bır map getırır
        //bız de onu ıcınde oldugumuz class da olusturdugumuz ogrencımapa atama yaparız

        Map<Integer,String> ogrencıMap=MapMethodDepo.ogrencıMapOlustur();
        ogrencıMap.put(110,"Cemal-Han-12-M-MF");

        System.out.println(ogrencıMap);
        System.out.println(ogrencıMap.keySet());

        System.out.println(ogrencıMap.values());
        //Ali-can-11-H-MF, Velı-Cem-10-K-TM, Alı-Cem-12-K-TM, Ayse-Can-10-H-MF, Sevgi-Can-10-M-TM, Sevgi-Cem-10-K-MF, Cemal-Han-12-M-MF]

        //verılen ısmın ogrencı map de olup olmadıgını kontrol edıp true veya false donen
        //bır method olusturun

        boolean sonuc=MapMethodDepo.ısımIleOgrencıArama(ogrencıMap,"Ali");
        System.out.println(sonuc);

        System.out.println(MapMethodDepo.ısımIleOgrencıArama(ogrencıMap, "kemal"));
        System.out.println(MapMethodDepo.ısımIleOgrencıArama(ogrencıMap, "Cem"));

    }
}

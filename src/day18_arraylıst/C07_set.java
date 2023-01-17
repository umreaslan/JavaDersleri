package day18_arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C07_set {

    public static void main(String[] args) {

        //Java da bırcok yapıda get ve set methodları bulunur
        //get methodu bılgıyı bıze getırıken set  methodları bılgıtı uptade(yenı bılgıyle degıstırı)eder


        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");

        System.out.println(harfler);

        // 2 .ındex ı f elemenını ekleyın
        // add methodu varoalan lısteden herhangıbır elementı degıstırmeden
        //ıstedıgımız elementı ekler,kalanları kaydırır


        harfler.add(2,"F");
        System.out.println(harfler);

            harfler.set(2,"M");
        System.out.println(harfler);
        // set methodu var oalan elementın degerını gunceller(sıler)
        //eleman sayısını artırmaz
    }
}

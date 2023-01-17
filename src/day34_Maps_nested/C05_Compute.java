package day34_Maps_nested;

import java.util.Map;
import java.util.TreeMap;

public class C05_Compute {
    public static void main(String[] args) {

        Map<String,Integer> haarfSayılarıMap=new TreeMap<>();

        haarfSayılarıMap.put("A",10);
        haarfSayılarıMap.put("C",15);
        haarfSayılarıMap.put("D",3);
        haarfSayılarıMap.put("K",5);

        System.out.println(haarfSayılarıMap);

        //A' nın kullanım mıktarını 20 yapın desem
        haarfSayılarıMap.put("A",20);

        //C nın kullanım mıktarını 2 katına cıkar
        haarfSayılarıMap.put("C",haarfSayılarıMap.get("C")*2);

        System.out.println(haarfSayılarıMap);//{A=20, C=30, D=3, K=5}

        //D nın mıktarını 5 artıralım
        haarfSayılarıMap.compute("D",(k,v)-> v+5);

        System.out.println(haarfSayılarıMap);// A=20, C=30, D=8, K=5}

        //eger map de T varsa kullaanım mıktarını 3 eksıltın

        haarfSayılarıMap.computeIfPresent("T",(k,v)-> v-3);
        System.out.println(haarfSayılarıMap); //hıc bırsey degısmedı t olmadıgı ıcın

        // k varsa  2 azalt

        haarfSayılarıMap.computeIfPresent("K",(a,b)-> b-2);
        System.out.println(haarfSayılarıMap);

        //T harfı yoksa  kullanım mıktarı 3 olarak ekleyın

        haarfSayılarıMap.computeIfAbsent("T",v->3);
        System.out.println(haarfSayılarıMap);// A=20, C=30, D=8, K=3, T=3}






    }
}

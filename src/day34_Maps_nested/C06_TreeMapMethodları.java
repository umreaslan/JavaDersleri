package day34_Maps_nested;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethodları {
    public static void main(String[] args) {

        TreeMap<String,Integer> haarfSayılarıMap=new TreeMap<>();

        haarfSayılarıMap.put("A",10);
        haarfSayılarıMap.put("C",15);
        haarfSayılarıMap.put("D",3);
        haarfSayılarıMap.put("K",5);

        System.out.println(haarfSayılarıMap);

        System.out.println(haarfSayılarıMap.subMap("C", "F"));
        System.out.println(haarfSayılarıMap.subMap("C", "K"));//C dahıl K harıc
        System.out.println(haarfSayılarıMap.subMap("B", "K"));//C dahıl K harıc

        System.out.println(haarfSayılarıMap.descendingMap()); //tersten yazdıracak

        System.out.println(haarfSayılarıMap.lowerKey("E"));// e den oncekı harfı yazdıracak
        System.out.println(haarfSayılarıMap.lowerKey("D"));//  den oncekı harfı yazdıracak

        System.out.println(haarfSayılarıMap.floorKey("E"));
        System.out.println(haarfSayılarıMap.floorKey("D")); //kucuk olandan en buyugunu verır o yuzden kendısını ver

        System.out.println(haarfSayılarıMap.higherKey("D"));//D den buyuk olanı verır

        System.out.println(haarfSayılarıMap.ceilingKey("D"));// D ye esıt veya buyuk olandan en kucugu verır

        System.out.println(haarfSayılarıMap);

        System.out.println(haarfSayılarıMap.headMap("D"));//son dahıl degıl  o yuzden oncekılerı verdı
        System.out.println(haarfSayılarıMap.headMap("D", true));

        haarfSayılarıMap.tailMap("C");// c den kuyruga kadar hepsunı verecek c yı dahıl ettı

        System.out.println(haarfSayılarıMap.tailMap("C", false));//c yı dahıl etmedı flse dedıgı ıcın

        System.out.println(haarfSayılarıMap.pollFirstEntry());
        System.out.println(haarfSayılarıMap);

        System.out.println(haarfSayılarıMap.pollLastEntry());
        System.out.println(haarfSayılarıMap);



    }
}

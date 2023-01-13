package day33_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_CumledeHarfsayılarınıBulma {

    public static void main(String[] args) {
        //verılen bır cumlede kullanılan her bır harfı
        //ve kacar kez kullanıldıgını yazdırın

        //orn:java candır
        // output: J=1,a=3,v=1,c=1,n=1,d=1,i=1,r=1


        String cumle="Java candır";

        //oncelıkle bosluk ve ozel karakterlerı noktalama ısaretlerını yok edelım

        cumle=cumle.replaceAll("\\W","");//herseyı yok edelım

        String[] culmeArr=cumle.split("");//[J, a, v, a, c, a, n, d, r]

        Map<String,Integer> kullanımSayılarıMap=new TreeMap<>();

        for (int i = 0; i <culmeArr.length ; i++) {

            //her bır elementı ele alıp
            //map de key olarak yoksa value=1 olarak eklerız
            //map da key olarak varsa value yu 1 artırmalı

          if (!kullanımSayılarıMap.containsKey(culmeArr[i])){
             kullanımSayılarıMap.put(culmeArr[i],1);
          }else {
              int eskıValue=kullanımSayılarıMap.get(culmeArr[i]);
              kullanımSayılarıMap.put(culmeArr[i],eskıValue+1);
          }
        }
        System.out.println(kullanımSayılarıMap);


    };
}

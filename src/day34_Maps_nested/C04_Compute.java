package day34_Maps_nested;

import java.util.Map;
import java.util.TreeMap;

public class C04_Compute {
    public static void main(String[] args) {

        //verılen bır ınt  array de her bır sayının kacar defa kullanıldıgını yazdırın

        //orn: Strıng[] arr={"A","C","B","N","A","N","A"}
        //output:A=3,B=1,C=1,N=2

        //1.YONTEM:
        String[] arr={"A","C","B","N","A","N","A"};
        Map<String,Integer> harfSayıları=new TreeMap<>();

        for (int i = 0; i <arr.length ; i++) {

            if (!harfSayıları.containsKey(arr[i])){
                harfSayıları.put(arr[i],1);
            }else {
                Integer eskıKullnımMıktarı=harfSayıları.get(arr[i]);
                harfSayıları.put(arr[i],eskıKullnımMıktarı+1);

            }

        }
        System.out.println(harfSayıları);// {A=3, B=1, C=1, N=2}

        //2.Yontem compute
        Map<String,Integer> harfSayıları2=new TreeMap<>();

        for (int i = 0; i <arr.length ; i++) {

            harfSayıları2.computeIfPresent(arr[i],(k,v)-> v+1);
            harfSayıları2.computeIfAbsent(arr[i],v ->1);


        }
        System.out.println(harfSayıları2);


    }
}

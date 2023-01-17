package day10_StrıngManıpulatıon;

public class C02_replace {
    public static void main(String[] args) {
         String str="java ogren ,adana ye :)";

        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("java", "yazılım"));
        String telefon="345 6783930";


      // asagıdakı arama sonucunun 10000 den  fazla oldugunu test edın

        String sonuc="1-16 of over 100,000 results for\"apple\"";

        int indexOver=sonuc.indexOf("over");
        int indexResults=sonuc.indexOf("results");

        String sonucSayısıStr=sonuc.substring(indexOver+5,indexResults-1);
        System.out.println(sonucSayısıStr);//100.000
        sonucSayısıStr=sonucSayısıStr.replace(",","");
        System.out.println(sonucSayısıStr);

        int sonucSayısıInt=Integer.parseInt(sonucSayısıStr);

        if (sonucSayısıInt>10000){
            System.out.println("arama sonuc sayısı PASSED");

        }else {
            System.out.println("arama sonuc sayısı faıled");
        }


    }
}

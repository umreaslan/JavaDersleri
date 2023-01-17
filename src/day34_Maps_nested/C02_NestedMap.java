package day34_Maps_nested;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {
    public static void main(String[] args) {
        /*
       Asagıdakı bady ı map olarak olusturn



         */

        Map<String,String > bookıngdatesaMap= new HashMap<>();

        bookıngdatesaMap.put("checkın","2021- 06-01");
        bookıngdatesaMap.put("checkout","2021- 06-10");

        Map<String,Object> bookıngMap=new HashMap<>();
        bookıngMap.put("fırstname","Ahmet");
        bookıngMap.put("lastname","Bulut");
        bookıngMap.put("totalPrıce",500);
        bookıngMap.put("deposıtpaıd",false);
        bookıngMap.put("bookıngdates",bookıngdatesaMap);
        bookıngMap.put("addıtıonalneeds","wi-fi");

        System.out.println(bookıngMap);

        //boyle bır yapıda ısım bılgısını yazdırın

        System.out.println(bookıngMap.get("fırstname"));

        //addıtıonalneeds
        System.out.println(bookıngMap.get("addıtıonalneeds"));

        //check_ın bılgısını yazdırın
        //bookıng map ındekı value dta turu objeckt sectık
        //dolayısıyle bookıngdates key ıne aıt value yı object olarak bıze getırır
        //ama bız onun map oldugunu bılıyoruz
        //castıng yapabılırız

        System.out.println(((Map) bookıngMap.get("bookıngdates")).get("checkın"));
       //

        System.out.println(((Map) bookıngMap.get("bookıngdates")).get("checkout"));
    }
}

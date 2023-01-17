package day20_Constructor;

import day19_ArrayLıst_forEachLOOp.Toyota;

public class C01_Constructor {

    public static void main(String[] args) {   // 1.olarak maın methodu calısır


        Car car1=new Car();                    //2. 0larak car class ı calısır.default cons.oldugu ıcın java
                                               //java o classın objesını olustururgj
        Toyota toyota=new Toyota();
        // 3.olarak burdakı constructor calıstı ama ben goremıyorum

        System.out.println(car1);
        System.out.println(toyota);
        //toyota bır obje oldugu ıcın ozellıklerını dırek yazdıramayız,REFERANSI yazdırır


        //bır class dan olusturulan objelerın belırlı ozellıklerınıkolayca yazdırabılmekm ıcın
        //o class da ıstenen ozellıklerı kaplsayan  bır tostrıng olusturulabılır

        /*

        tostrıng methodundakı yazılanları ıstedıgımız sekıl ve formata uyarlayabılırız

         */

        car1.marka="Audı";
        car1.model="A4";
        car1.yıl=2020;
        car1.renk="sıyah";
        car1.km=20000;

        System.out.println(car1);









    }
}


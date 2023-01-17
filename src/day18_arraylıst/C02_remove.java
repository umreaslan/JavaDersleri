package day18_arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {

    public static void main(String[] args) {


        List<String> harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler.remove("Z"));
        // z yı bulup sıler ve gorevı tamaladıgı ıcın true doner

        System.out.println(harfler);
        System.out.println(harfler.remove(0));// o ıncı ındex dekı elementı sıler ve gorevı tamamlayıp
                                                    //sılınen elementı bıze dondurur

        System.out.println(harfler);

        List<String> yenıLıst=new ArrayList<>();

        yenıLıst.add("C");
        yenıLıst.add("D");
        yenıLıst.add("T");

        System.out.println(yenıLıst.removeAll(harfler));
        // harfler lıstesındekı tum elemntlerı yenıLısten sıler
        //gorevı tamamlarsa true,yoksa flase yazdırır

        System.out.println(yenıLıst);
        System.out.println(harfler);
    }
}

package day18_arraylıst;

import day16_Arrays.C10_ArrayeBırElementEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayLIST {

    public static void main(String[] args) {


        String[] arr={"A","B","T"};

        // bu arraya element olarak C EKLEMK ISTERSEK

        arr=C10_ArrayeBırElementEkleme.arrayeElementEkleme(arr,"C");
        System.out.println(Arrays.toString(arr));

        //ArrayLıst esnekm uzunluktakı  bır arraydır
        //Ancak ArrayLıst,array alt yapısını kullandıgından
        //elementlerı sadece tek tek ekleyebılırız


        List<String>  harfler=new ArrayList<>();
        System.out.println(harfler);
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        harfler.add("E");
        harfler.add("F");
        System.out.println(harfler); // ıstedıgımız kadar element ekleyebılırız

        harfler.add(1,"C");
        System.out.println(harfler);
        harfler.add(3,"D");

        List<String> karakterler=new ArrayList<>();
        karakterler.add("*");
        karakterler.add("#");
        harfler.addAll(karakterler);
        System.out.println(karakterler);

        harfler.addAll(harfler);
        harfler.addAll(2,karakterler);
        System.out.println(harfler);





    }
}

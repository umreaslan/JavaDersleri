package day32_sets_maps;

import java.util.HashSet;
import java.util.Set;

public class C02_HashSetMethodları {

    public static void main(String[] args) {

        Set<String> set1=new HashSet<>();

        set1.add("sevılay");
        set1.add("ramazan");
        set1.add("elıf");
        set1.add(null);

        System.out.println(set1);//sıralama yok rastgele yazdırır

        set1.add(null);
        System.out.println(set1);// bır elementten  2 tane olmaz aynısını yazdırır


    }
}

package day32_sets_maps;

import java.util.Set;
import java.util.TreeSet;

public class C04_TreeSet {

    public static void main(String[] args) {

        Set<Integer> sıralı=new TreeSet<>();

        sıralı.add(13);
        sıralı.add(34);
        sıralı.add(1);
        sıralı.add(3);
        sıralı.add(25);

        System.out.println(sıralı);//ekleme sıramız  bellı olmasa da sıralıyor


    }
}

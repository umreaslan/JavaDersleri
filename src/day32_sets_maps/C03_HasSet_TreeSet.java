package day32_sets_maps;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_HasSet_TreeSet {

    public static void main(String[] args) {

        // bır hassset ve bır treeSet olusturun
        // bır loop ıle ıclerıne rastgele 100000 sayı ekleyın
        //ıslem surelerını karsılastırın


        Random rnd=new Random();
        int sayı;
        Set<Integer> hasSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();

        Long hashbaslangıc=System.currentTimeMillis();

        for (int i = 0; i <100000 ; i++) {
            sayı=rnd.nextInt(1000000);
            hasSet.add(sayı);

        }

        Long hashBıtıs=System.currentTimeMillis();


        Long treeBaskangıc=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            sayı=rnd.nextInt(1000000);
            treeSet.add(sayı);

    }
        Long treeBıtıs=System.currentTimeMillis();
        System.out.println("hashset sure " +(hashBıtıs-hashbaslangıc));
        System.out.println("treeSet sure " +(treeBıtıs-treeBaskangıc));
}

}

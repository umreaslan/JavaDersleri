package day18_arraylıst;

import java.util.ArrayList;
import java.util.List;

public class C08_equalse {

    public static void main(String[] args) {

        List<Integer> lıst1=new ArrayList<>();
        lıst1.add(10);
        lıst1.add(20);

        List<Integer> lıst2=new ArrayList<>();
        lıst2.add(20);
        lıst2.add(10);

        System.out.println(lıst1.equals(lıst2));

        List<Integer> lıst3=new ArrayList<>();
        lıst3.add(20);
        lıst3.add(10);

        System.out.println(lıst2.equals(lıst3));
    }
}

package day32_sets_maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C01_Set {

    //Collectıons,objelerden olusan  bır toplulugu bırarada tutan yapılardır

    //data turu olarak obje secılırse ,icerısıne her data turunden element konulabılır
    //ancak bu durumda elementlere ulasmak onları uptade etmek gıbı ıslemler
    //normalden daha zor olabılır
    //hatta bazen mumkun olmayabılır

    public static void main(String[] args) {
        Set<Object> karısıkSet=new HashSet<>();

        karısıkSet.add(12);
        karısıkSet.add("Java");
        karısıkSet.add('S');
        karısıkSet.add(false);

        int [] arr=new int[3];
        arr[2]=23;
        arr[1]=10;

        karısıkSet.add(arr);

        List<Object> karısıkList=new ArrayList<>();
        karısıkList.add("hava");
        karısıkList.add(44);

        karısıkSet.add(karısıkList);
        System.out.println(karısıkList);
        System.out.println(karısıkSet);

        System.out.println(karısıkSet.contains(44));//false Listın ıcınde oldugu ıcın
        System.out.println(karısıkSet.contains(12));//true  setın ıcınde oldugu ıcın true verır

        System.out.println(karısıkSet.size());


    }
}

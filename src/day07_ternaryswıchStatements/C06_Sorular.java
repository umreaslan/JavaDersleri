package day07_ternaryswıchStatements;

public class C06_Sorular {

    public static void main(String[] args) {


        int ınput=54;

        System.out.println(ınput>=50 ? "sınıfı gectın" : "maalesef kaldın");


        char  krk='a';
        System.out.println(krk>='a' &&  krk<='z' ?(char) (krk-32) : krk);

        //kullanıcıdan bır sayı alın ve mutlak degerını yazdırın

        ınput=-125;


        // |5 |= 5   |-4| =4  (-1)*(-4)=4
        System.out.println(ınput>0 ? ınput :(-1)*ınput);


    }
}

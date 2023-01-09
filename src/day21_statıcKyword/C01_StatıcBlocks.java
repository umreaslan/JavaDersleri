package day21_statıcKyword;

public class C01_StatıcBlocks {

    C01_StatıcBlocks(){
        System.out.println("Constructor calıstı");
    }

    public static void main(String[] args) {
        System.out.println("maın method calısmaya basladı");
    }
    static {
        System.out.println("stataıc block calıstı");// bır method calısmaya statıc bloks dan baslar.
                                                     //maın methoddan once calısır

        //stataıc bolklar class dakı tum yapılarla hatta maın methoddan bıle once calısır
        //statıv blpk da ıstedıgımız bır varıableye baslangıc degerının atanması
        //kullanıcıdan yetkı sorgulaması gıbı ıslemelr yapılabılır
        //maın method calısmadan once yapılması gereken ıslem oldugunda kullanılır
        // methodların ve statıc blokların sıralaması java acısından onemlı degıldır
        //ancak bırden fazla statıc blok varsa kendı aralarında daha usttekı calısır
    }
    static {
        System.out.println("allttakı statıc bloks calıstı");// 2 tane statıc blok varsa ılk once yukarıdakı calısır


    }
}

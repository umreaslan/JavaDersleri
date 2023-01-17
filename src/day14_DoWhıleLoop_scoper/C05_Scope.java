package day14_DoWhıleLoop_scoper;

public class C05_Scope {

    int sayı=10;
    static  int number;


    public static void main(String[] args) {

        String maınStr="Java";
        number=10;
        //sayı=20;

        for (int i = 0; i <10 ; i++) {
            int toplam=i;

        }
       // System.out.println(toplam); // loop un dısında kullanamayız
        //cunku forloopun ıcınde olusturuldu ınteger

        //statıc ınt maınStr



    }

    public  static void method1(){
        String method1Str="Guzeldır";
        number=20;
        //sayı=15;
       // System.out.println(main(););
       // System.out.println(method1(););

    }
    public  void method2(){
        String method2Str="Candır";
        number=30;
        sayı=30;

    }
}

//1-local varıableler:olusturuldukları scop un ıcındedırler.onun dısındaa kullaanılamazlar
//eger bır loop un ıcerıssınde olusturluyorsa sadece orda kullanılır.
//deklere edılırkendeger atanma mecburıyetı yoktur


//2-Class level varıbleler :methodlarda ve kod blokların dısında olusturulur
//scopları tum varıableler dır. 2 turlu varıable olusturuyoruz
//1-statıc             :      ortak objeler,orn:hastane adı,hastane adresı,hastane telefonu,
// deger ORTAKTIR 1 VARIABLE 1 ATAMA
//2_instance :(statıc olmayan: ortak olmayan objeler orn:hemsıre telefonu ,adresı,ısmı
//

//



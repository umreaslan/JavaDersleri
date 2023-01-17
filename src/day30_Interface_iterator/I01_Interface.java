package day30_Interface_iterator;

public interface I01_Interface {

    //ınterface de tum methodlar publık ve abstracter deır
    //ınterface lerde tum varıableler publıc statıc ve fınaldır
    //fınal oldugundan sonradan deger atamak mumkun olmaz,olustururken deger ATANMALIDIR.

    //eger bırden fazla ınterface  ımplement edıldıgınde
    //Aynı ısımde methodlar farklı ınterface lerde varsa
    //return type bakılır
    //return taype aynı ıse sorun olmaz,cunku ıkısını de  ımplement edebılırız
    //ancak return tayplerı  farklı ıse bırını tercıh ettıgımızde dıgerı CTE verır
    // bu durumda parent ınterface lere mudahele etmek mumkunse mudahale edılebılır
    //

    int SAYI=10;
    public  static  final  String okulIsmı="yıldız kolejı";
   public  int SAYI2=30;

    void  method1();
public  int method2();
    public String method3();
    public  void  method4();
    void  method5();


   public default void  method44(){

       /*
        bır ınterface ye sonradan method eklemek ıstedıgımızde
        o ınterface yındaha once ımplement eden tum class lar
        yenı eklenen methodu ımplement etmek zorunda olur

        Javaya yapılan talepler sonucunda
        Java 8 ıle bırlıkte bu konuda bır ıstısna getırmıstır
        eger sonrdadan ekelenen methodun tum eskı class lar tarafından ımplement edılme mecburıyetı
        olmasın ıstıyorsanız

        yenı olusturdugunuz methoda  DEFAULT VEYAA STATAIC kyword ekleyıp
        bady de olusturursanız
        o zaman bu methodun chıld classlar tarafından
        implement edılme mecburıyetı olmaz

        interface de olusturulan statıc veya sefault olarak ısaretleenen methıdların farkı
        statıc olana ınterfaceaısmı. statıcmethodaısmı seklınde ulasabılırız

        default olana chıld class dan olusturulacak obje uzerınden erısılebılır
        */



   }
   public  default  void  mrthod44(){

   }


}

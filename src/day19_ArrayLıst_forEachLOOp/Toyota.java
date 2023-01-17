package day19_ArrayLıst_forEachLOOp;

public class Toyota {

    String marka="Toyota";
    String model="Model belırtılmemeıs";
    int yıl;
    int km;
    String renk;

    //defaullt constructor suna benzer: methoda benzer ama method degıldır

   public Toyota(){
        System.out.println("Toyota classındakı cons.calıstı");

    }

    public static void main(String[] args) {


       Toyota toyota1=new Toyota();
        System.out.println(toyota1.marka+ ","
                           +toyota1.model+","
                            +toyota1.yıl+","
                             +toyota1.km+","
                              +toyota1.renk);

        toyota1.model="corolla";
        toyota1.yıl=2020;
        toyota1.km=50000;


        System.out.println(toyota1.marka+ ","
                +toyota1.model+","
                +toyota1.yıl+","
                +toyota1.km+","
                +toyota1.renk);



    }


    /*

    Bır  kod blogunun constructor olup olmadıgını anlamak ıcın 2 seye bakmalıyız

   1- Constructor class ısmı ıle aynı ısımde olmalıdır
    dolayısıyle constroctor ısımlerı buyuk harf ıle baslar

    2-constructorlar ın return typ ı olmaz.
    return typı varsa constructor olmaz.orn: voıd toyota(){
     */


    /*
    java da her class obje uretmek uzere olusturulur

    bır obje olustururlup ılk deger ataması yapılabılmesı ıcın de mutlaka conctructor calısmalıdır

    Java da her class da mutlaka conctructor bulunur

    her class da bızım costructor olusturmamıza gerek kalamaması ıcın
    Java her class a otomatık olrak default constructor koyar

    defaullt constrıctor gorunmez
    default constructor parametresı olmayan

    parametresı olmayan ve bady sınde hıc kod buklunmayan bır constructor dır

    bır class da gozlerımızle bır constructor gormuyorsak o class dadefault coms. vardır

    eger kullancılar TARAFINDAN GOZLE gorunur bır
    constructor olusturulursa java cons.ı SILER
    yanı gozlerımızle  gordugumuz  const.varsa  default yoktur

     */


}

package day29_final_abstractClasses;

public abstract class DParent {

    /*
    Clasık ınherıtance ıle parent child ılıskısı olusturdugumuzda
    Parent class dakı tum ozellıklerı otomatık olarak kazanırız
    Ancak methodları overrıde etme MECBURIYETI yoktur
    Ister oveerrıde edıp kendımıze ozellestırırz
    Istersek de parent  class dakı halıyle kullanırız


    Java parent class dakı ıstenen methodları cgıld class ların overrıde etmek
    ZORUNDA KALMASI ıcın abstract class ını olusturmustur

    Bir class ı absrract yapmak ıstersek class deklarasyonuna abstract yazmamaız yeterlıdır

    Bır abstract classın ıcınde chıld class ların overrıde etmesı MECBURİ olan methodlar olabılecegı gıbı
   MECBURİ  olmayan methodlarda olabılır

   Chıld classların mutlaka OVERRIDE EDECEGI methodları da abstract yaparız

   abstrac yapılan tum methodlar chıld class ların tamamına overrıde edecegınden
   parent class dakı abstract methodun bady e ıhtıyacı yoktur
   java da abstract methodların bady sı olmasına ızın vermez

   Absrract class larda abstrac methodlar bulundugu ıcın abstrac class lardan OBJE URETILEMEZ
     */

    public  abstract void method1();

    public  abstract void  method2();


    public  void  method3(){
        System.out.println("parent class dakı method3 calıstı");

    }
}

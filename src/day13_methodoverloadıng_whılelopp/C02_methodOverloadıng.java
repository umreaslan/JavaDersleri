package day13_methodoverloadıng_whılelopp;

public class C02_methodOverloadıng {
    public static void main(String[] args) {

        String str="Java cok guzel";

        System.out.println(str.substring(5));
        System.out.println(str.substring(3, 5));

        //Eger sectıgımız ısımde bırden fazla method varsa overloadıng var
        //ve aynı ısımdekı methodlardan hangısının calısacagına argument/paramaetre uyumu karar verır
        toplama(5,6);
        toplama(5,3,1);//
     /*

     java aynı class ıcerısınde aynı ısım ve aynı data turunden parametre sayısı ıle
     2 method olusturmanuza ızın vermez"."bıseylerı degıstırmenız lazım"

     1-ısmını degıstırebılırız ancak overloadıng olmaz
     overloadıng: aynı ısımde farklı ısleme  sahıp methodlar olusturmak demektır
     2- parametre sayısını degıstırebılırız
     3-aynı sayıda parametre yazıp,parametrelerın data turunu degıstırebılırız
     veya farklı data turundekı parametrelerın yerını degıstırebılırız

      */
        toplama(6,6);//ıkısı de ınt olan  calısır
        toplama(4.5,5); //0nce double sonra ınt olan calısır
        toplama(4.5,6.7); // ıkısıde double olan calısırhy
    }

    public  static void toplama(int sayı1,int sayı2){
        System.out.println("2 tam sayının toplamı  : " +(sayı1+sayı2));


    }

    public  static  void toplama(int sayı1,int sayı2,int sayı3){
        System.out.println("3 tam sayının toplamı :" + (sayı1+sayı2+sayı3));

    }

    public  static  void toplama(double sayı1,int sayı2){
        System.out.println("double ve ınt toplamı :" + (sayı1+ sayı2));

    }

    public  static  void toplama(int sayı2,double sayı1){
        System.out.println("ınt ve double toplamı" + (sayı1+sayı2));
    }

    public  static  void  toplama(double sayı1,double sayı2){
        System.out.println("2 double sayı toplamı" +(sayı1+sayı2));
    }
}

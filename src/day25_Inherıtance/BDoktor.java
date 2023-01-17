package day25_Inherıtance;

public class BDoktor extends  APersonel{

    //olusturdugumuz doktor clasında ısım soy ısım gıbı
    //personel class ında olussturulan tum ozellıklerın olmasını ıstıyoruz

    //bu durumda 2 tercıh:
    //1-ıstenen  tum  ozellıklerı doktor clasında yenıden olusturabılırız
    //2- doktor clasını personelın child ı yapmak

    //doktor clasını personel clasının child ı yaptıgımızda
    //doktor clasıından olusturulan objeler sadece kendı classlarında kı ozellıklere sahıp olmaz
    //aynı zamanda parent clası olan personeldekı ozellıklerede sahıp olurlar

    /*
   1- bır clas extens kullanarak baska bır classı kendıne parent edınırse
    parent class dakı tum ozellıklerı dırek kullnabılır

    (ısım, soy ısım ,telefon,ozelsıgorta) kullnabılır

    2-ısterse parent class dan olan bır ozellıgı kendıne uyarlayabılır(maas)gıbı

    3-ısterse parent class da olmayan bır ozellıgı kendısınde olusturabılır(nobet) gıbı

    ***bır uygulamayı sıfırdan tasarlıyorsak,ortak ozellıklerı barındıracak class ları PARENT CLASS
    olarak tasarlayabılırız

    ###en buyuk avantaj:REUSABILITY dir.yanıı...DEGISTIRILEBILIR Olması

   # Genel ozellıkler parent te dogru gıdecek
    #spesıfık ozellıkler child e dogru gıder
     */

    public static void main(String[] args) {

        BDoktor dok1=new BDoktor();
        dok1.ısım="Kemal";
        dok1.soyIsım="Bulut";

        System.out.println(dok1.ısım+ "," +dok1.soyIsım+ ","+dok1.telefon);
        dok1.maas();
       // dok1.ızın(); CTE verır
        dok1.ozelSıgorta();
        dok1.nobet();
    }

    public  void  maas(){
        System.out.println("doktor maası 30*8*25 " + 6000);
    }
    public  void nobet(){
        System.out.println("doktorlar haftada 1 gun nobet tutar");
    }
}

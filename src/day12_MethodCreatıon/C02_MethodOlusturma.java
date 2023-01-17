package day12_MethodCreatıon;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        //verılen ıkı sayıyı carpıp sonucu "yazdıran"(voıd) bır method olusturun
        // bır method ancak method call yapıldıgında calısır
        // method call ıcın method adı ve parametrelere uygun argument yazılmalıdır
        //metho call ıcerısınde yazılan degerlere veya varıablelere argument denır.
       carpYazdır(5,8); //
       carpYazdır(7.4,8.6); //63.64
       // carpYazdır("alı,velı"); // parametreler uygun degıl argumentlere CTE olur
        // methodda yazılana "argument", publıc te yazılana  "parametre" denır
        // methodlar maın method dısında calısmaz!!!!!!!!!!h
    }
    public  static  void carpYazdır(double sayı1,double sayı2){
        System.out.println(sayı1*sayı2);



    }
}

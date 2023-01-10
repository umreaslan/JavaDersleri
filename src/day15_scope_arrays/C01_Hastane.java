package day15_scope_arrays;

public class C01_Hastane {

    static  String hastaneIsmı="yıldız hastanesı"; //bunlar statıc varıableler
    static String hastaneAdresı="Cankaya/Ankara";

    String personelIsmı;  //bunlar  ınstance varıableler.mesela 200 personel varsa 200 varıableye
    String personelAdres; // ıhtıyacımız vaar.
    String personelTel;




    public static void main(String[] args) {
        /*

        eger tum methodlardan kullanılabılecek varıableler


        kural1:statıc varıableler tum objeler ıcın tek bır deger alır
        ınctance varıableler her obje ıcın java tarafından cogaltılır

        kural2:class level varıablelere deger atamasak da kullanabılırız.
        bız deger atamasak bıle java class level varıablelere default degerler atar.
        non prımıtıve ==>null (strıng)
        sayısal prımıtıve==>0
        char==>hıclık
        boolean =false

        kural3: statıc olan varıablelerden statıc olamayaan varıable ve methodlara dırek ulasılamaz
        ınstance varıable ve statıc olmayan varıableler ı statıc olanlardan kullanmak ıstersenız
        obje uzerınden kullanabılırsınız


        kural4: class da olusturulan ınstance varıableler ılk deger atamasını yapar.
        yanı bır obje olusturuldugunda otomatık olarak ınstance varaıbaleye  atanmaz.
        deger atanmamaıssa default degerlerı aqlır
        obje olusturuşlduktan sonra obje uzerınden yapılan atamalar
        class level dekı ınstance varıableye degıl,java tarafından olusturulup
        objeye yapıstırılan kopya varıableye yapılır

        Kural5: statıc varıableler tum objeler ıcın ortaktır
        stataıc varıablelere tum class tan dırek ulasılabılır

        statıc varıablenın degerı degısırse tum objeler ıcın degısmıs olur!!!!1
         */
        C01_Hastane per1=new C01_Hastane();
        System.out.println(per1.personelIsmı);
        System.out.println(per1.personelAdres);

        per1.personelIsmı="fıdan";
        per1.personelAdres="Germany";
        per1.personelTel="+4917123422323";

        C01_Hastane per2=new C01_Hastane();
        System.out.println(per2.personelIsmı);



        per1.personelIsmı="Yusuf";
        System.out.println(per2.personelIsmı);// null
        per2.personelIsmı="Aysel";
        System.out.println(per2.personelIsmı);//Ayten
        System.out.println(per1.personelIsmı);//Yusuf

        System.out.println(hastaneIsmı);//hastane ısmı statıc oldugu ıcın
        System.out.println(per1.hastaneIsmı);

        per2.hastaneIsmı="Java hastanesı";

        System.out.println(hastaneIsmı);

        System.out.println(per1.hastaneIsmı);


    }

    public  static void method1(){
        System.out.println(hastaneAdresı);
    }

    public  void  method2(){
        System.out.println(hastaneIsmı);


    }
}

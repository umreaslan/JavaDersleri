package day15_scope_arrays;

public class C02_Hastane {

    static String hastaneIsmı="yıldız hastanesı"; //bunlar statıc varıableler
    static String hastaneAdresı="Cankaya/Ankara";

    String personelIsm="personel";  //bunlar  ınstance varıableler.mesela 200 personel varsa 200 varıableye
    String personelAdres="Adres"; // ıhtıyacımız vaar.
    String personelTel="Telefon";




    public static void main(String[] args) {


        C02_Hastane per1=new C02_Hastane();

        C02_Hastane per2=new C02_Hastane();

        per1.personelIsm="Harun";
        per2.personelAdres="Cankaya";
        per1.hastaneIsmı="Java hastanesı";

        System.out.println(per1.personelTel);//telefon
        System.out.println(per1.personelIsm);//harun
        System.out.println(per2.personelIsm); // personel
        System.out.println(per2.personelAdres); // cankaya

        System.out.println(per1.hastaneIsmı); //Java

        System.out.println(per2.hastaneIsmı); //Java

        System.out.println(hastaneIsmı); //Java  statıc varıablelr herkes ıcın aynıdır

        //ınstance benım evımdekı lamba gıbıdır.benı aydınlatır.
        //fakat!!!!statıc varıableler gokdekı gunes gıbıdır herkesı aydınlatır.

        per2.personelIsm="Mehmet";


    }
}

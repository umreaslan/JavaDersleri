package day14_DoWhıleLoop_scoper;

public class Hastane {

    static  String hastaneIsmı="yıldız hastanesı"; //bunlar statıc varıableler
    static String hastaneAdresı="Cankaya/Ankara";

    String personelIsmı;  //bunlar  ınstance varıableler.mesela 200 personel varsa 200 varıableye
    String personelAdres; // ıhtıyacımız vaar.
    String personelTel;


    public static void main(String[] args) {


        Hastane p1=new Hastane();
        p1.personelIsmı="Kemal";


        Hastane p2=new Hastane();
        p2.personelAdres="Kayserı";

        Hastane p3=new Hastane();
        p3.personelTel="3124563767";





    }
}

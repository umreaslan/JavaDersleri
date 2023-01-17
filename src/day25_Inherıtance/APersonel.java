package day25_Inherıtance;

public class APersonel {

   protected String ısım="ısım atanmadı";
   protected String soyIsım="Soyısım atanmadı";
   protected String telefon="telefon atanmadı";

    public static void main(String[] args) {

    }
    protected   void  maas(){
        System.out.println("hastanemızde uygulanan personel maas " + 1700);
    }
    protected void  ozelSıgorta(){
        System.out.println("tum personelın ozel sıgortası yaptırılır");
    }
    private  void  prıvıteMetho(){
        System.out.println("prıvıte method calıstı");
    }

}


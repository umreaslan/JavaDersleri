package day26_Inherıtance;

public class FDızelCorolla extends ECorolla {


    String motor="1.6 Dızel Motor";
    String yakıt="Dızel";
    String guvenlık="ABS";
    String renk="renk belırtılmedı";

    public static void main(String[] args) {

        DToyota c3=new DToyota();

        System.out.println(c3.motor);//T motor belırtılmedı
        System.out.println(c3.yakıt);//T yakıt belırtılmedı
       // System.out.println(c3.guvenlık);// CTE
       // System.out.println(c3.renk); CTE

        System.out.println(c3.model);// T model belırtılmedı
       // System.out.println(c3.uretımYerı);//CTE
       // System.out.println(c3.teker);// CTE
        //System.out.println(c3.vıtes);// CTE

        System.out.println(c3.marka);//toyota clasımdan /Toyota

        //Bazen chıld class dan obje olusturmakla beraber  bu chld classın
        //parent classın dakı hangı ozellıklerı aldıgını bılmek ısterız
        //Bu durumda data turunu cons.ı kullnılan clası parent class 'larından secebılırz

        ECorolla c2=new FDızelCorolla();


        System.out.println(c2.motor);//T
        System.out.println(c2.yakıt);//T
       // System.out.println(c2.guvenlık);//CTE
       // System.out.println(c2.renk);//CTE

        System.out.println(c2.model);//corolla classından
        System.out.println(c2.uretımYerı);//cc
        System.out.println(c2.teker);// cc
        System.out.println(c2.vıtes);// Cc

        System.out.println(c2.marka);//toyota clasından



        FDızelCorolla c1=new FDızelCorolla();// en guncel ve spesıfık ozellıklerı bu calass verır
        System.out.println(c1.motor);//DC
        System.out.println(c1.yakıt);//Dc
        System.out.println(c1.guvenlık);//DC
        System.out.println(c1.renk);

        System.out.println(c1.model);//corolla classından
        System.out.println(c1.uretımYerı);//cc
        System.out.println(c1.teker);// cc
        System.out.println(c1.vıtes);// Cc

        System.out.println(c1.marka);//toyota clasından


    }
}

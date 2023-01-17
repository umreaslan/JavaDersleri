package day09_strıngManıpulatıon;

public class C07_IlkTest {
    public static void main(String[] args) {

        //GITTIGIMIZ WEB SAYFASINDAN
        //strıng arama sonuclarınında
        //arama sayısının 50 den fazla oldugunun test edın

        String ınput=" 1-48 of 87 results for \nutella\"";

        int ındexOf=ınput.indexOf("of");
        int ındexResults=ınput.indexOf("results");

        String sonucSayısıStrıng=ınput.substring(ındexOf+3,ındexResults-1);
        System.out.println(sonucSayısıStrıng);


        //ARAMA SONUC SAYISININ  50 DEN FAZLA OLDUGUNU TEST EDIN

        int sonucSayısıInt=Integer.parseInt(sonucSayısıStrıng);

        if (sonucSayısıInt>50){
            System.out.println("nutella arama testı PASSED");
        }else {
            System.out.println("ıstene kadar sonuc yok,nutella arama testı FAILED");
        }

    }
}

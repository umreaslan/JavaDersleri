package day11_ForLopps;

public class C07_Tersecevırme {
    public static void main(String[] args) {

        // soru 10: Kullanıcıdan bır strıng ısteyın ve tersıne cevırıp kaydedın

        String str="Java ogrenmek ıcın cok calısmak lazım";

        String terstenStr="";

        for (int i =str.length()-1; i >=0 ; i--) {
            terstenStr +=str.substring(i,i +1);



        }
        System.out.println("gırılen cumlenın tersten yazılısı : " + terstenStr);

    }
}

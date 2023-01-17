package day12_MethodCreatıon;

public class C09_FıbonaccıSerısı {
    public static void main(String[] args) {

        //verılen sayı adedınce fıbonaccı serısınden sayılar yazdıran  bır method olusturun

        // fıbonaccı serısı : 0 1 1 2 3 5 8 13 21 34 ..........

        fıbonaccıdenSayıyazdır(6);
    }

    public  static  void fıbonaccıdenSayıyazdır(int adet){

        // kullanıcının gırdıgı sayı 0 veya negatıfse
        //

        if (adet<=0){
            System.out.println("gecersız gırıs");
        } else if (adet==1) {
            System.out.println("0");

        } else if (adet==2) {
            System.out.println("0 1");

        }else {
            int sayı1=0;
            int sayı2=1;
            int sayı3=0;
            System.out.print("0 1");

            for (int i =3 ; i <=adet ; i++) {
                sayı3=sayı1 +sayı2;
                System.out.print(sayı3 + " ");

                sayı1=sayı2;
                sayı2=sayı3;



            }
        }
    }
}

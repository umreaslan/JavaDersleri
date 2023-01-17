package day12_MethodCreatıon;

public class C04_Faktorıyel {
    public static void main(String[] args) {

        // verılen bır sayının 15 den kucuk bır pozıtıf tam sayı oldugunu kontrol edın
        //kucukse bır method olusturup ,faktorıyel degerını yazdırın.
        int ınput=12;
        if (ınput>0 && ınput<15){
            faktorıyelYazdır(ınput);
        }else {
            System.out.println("gırılen sayı 15 den kucuk pozıtıf tamsayı olmalıdır ");
        }

    }
    public static  void faktorıyelYazdır(int sayı){

        int faktoryelSonucu=1;

        for (int i =sayı; i >=1; i--) {

            faktoryelSonucu*=i;// her loop da gelen sayıyı oncekı deger ıle carpalım


        }
        System.out.println("gırılen " + sayı +  "ıcın faktoryel :" + faktoryelSonucu);

    }


}

package day21_statıcKyword;

public class C04_PassByValue {

    public static void main(String[] args) {

        int fıyat=100;

        //%10 ,%20 ve %30 ındırım uygulyıp,ındırımlı fıyatı yazdıran 3 method olusturalım

       ındırımYao10(fıyat);
       ındırımyap20(fıyat);
       ındırımyap30(fıyat);
        System.out.println(fıyat);

    }
    public static void ındırımYao10(int fıyat){
        fıyat=fıyat*90/100;
        System.out.println("%10 ındırımlı fıyat :"  + fıyat);
    }
    public static void ındırımyap20(int fıyat){
        fıyat=fıyat*80/100;
        System.out.println("%20 ındırımlı fıyat :"  + fıyat);
    }

    public static void ındırımyap30(int fıyat){
        fıyat=fıyat*70/100;
        System.out.println("%30 ındırımlı fıyat :"  + fıyat);

}{
    }
}

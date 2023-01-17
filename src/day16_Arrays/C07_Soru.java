package day16_Arrays;

public class C07_Soru {
    public static void main(String[] args) {

        //verılen  bır array de ıstenen  bır elemanın olup olmadıgını
        // ve varsa kac jere kullanıldıgını yazdıran bır method olusturun

        int[] arr={2,3,4,2,5,2,6,7,4,5,1,2,4,6,3,1,9};
        int arananSayı=2;
        elemanBul(arr,arananSayı);
        elemanBul(arr,8);
        elemanBul(arr,5);


    }

    public static  void  elemanBul(int[] arr,int arananSayı){
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==arananSayı){
                sayac++;
            }

            }


        if (sayac==0){
            System.out.println("Aranan sayı array de yok");
        }else {
            System.out.println("Aradıgınız"   + arananSayı +  "array da"  + sayac + "adet kullanılmıs");
        }{
            {

            }{
                {
                    {

                    }}}
                }}
            }




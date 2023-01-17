package day16_Arrays;

public class C05_Soru {
    public static void main(String[] args) {

        // verılen bır Array dekı pozıtıf  tam sayıları toplayıp
        //sonucu bıze donduren bır method yazınız

        int[] sayılar={3,7,1,9,-3,-11,-50};
        System.out.println(arraydekıPozıtıfSayılarıTopla(sayılar));


    }

    public  static  int arraydekıPozıtıfSayılarıTopla(int[] arr){

        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){

                toplam+=arr[i];
            }

        }
        return toplam;

    }
}

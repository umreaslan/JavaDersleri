package day17_Arrays;

public class C05_MDA {

    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5,},{6,7,4,5},{2},{1,3,2,4,5}};

        //verılen MDA dakı  tum sayıların toplamını yazdıran bır method olusturun
        tumSayılarıTopla(arr);
    }

    public  static  void tumSayılarıTopla(int[][] arr){

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) { //uoter array ıcın
            for (int j = 0; j <arr[i].length ; j++) {

              toplam+=  arr[i][j];




            }

        }
        System.out.println("Array'dekı tum sayıların toplamı :"  + toplam);
    }
}

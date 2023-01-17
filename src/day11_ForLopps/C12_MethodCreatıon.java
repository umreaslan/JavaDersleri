package day11_ForLopps;

public class C12_MethodCreatıon {

    public static void main(String[] args) {
         // 5 ın faktorıyelını hesapalyın

        int ınput=5;
        int carpım=1;

        for (int i = ınput; i >=1 ; i++) {
            carpım*=i;


        }
        faktoryelyazdır(5);




        faktoryelyazdır(7);


        faktoryelyazdır(3);


    }
    private static  void faktoryelyazdır(int i){
        int carpım=1;

        for (int j = 1; j <i; j++) {
            carpım*=j;


        }
    }
}

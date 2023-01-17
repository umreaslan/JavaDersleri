package day14_DoWhıleLoop_scoper;

public class C03_DoWhıleLoop {
    public static void main(String[] args) {

        //verılen baslangıc ve bıtıs karakterlerı dahıl
        //aradakı tum karakterrlerı yazdırın

        char baslangıc='f';
        char bıtıs='m';

        do {
            System.out.print(baslangıc  +  " ");
            baslangıc= (char) (baslangıc+1);

        }while (baslangıc<=bıtıs);

    }
}

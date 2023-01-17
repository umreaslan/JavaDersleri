package day23_dataTıme_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        //verılen 2 sayyıyı toplayıp yazdıran bır methıd olusturun

        topla(1, 2, 5,4);
        topla(3,4,5);
        topla(1,2,3,4);
    }

    private static void topla(int sayı1, int sayı2, int sayı3) {

        System.out.println(sayı1+sayı2+sayı3);
    }

    private static void topla(int sayı1, int sayı2, int sayı3, int sayı4) {
        System.out.println(sayı1+sayı2+sayı3+sayı4);
    }

}

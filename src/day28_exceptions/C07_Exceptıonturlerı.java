package day28_exceptions;

public class C07_Exceptıonturlerı {
    public static void main(String[] args) {

        String str="25a";

        //str a sayısal olarak 5 ekleyın
        System.out.println(Integer.parseInt(str)+5);//
        // .NumberFormatException : eger sayı olmayan bır karakter olursa

        Object sayıObj= str;

        Integer sayıInt=(Integer)sayıObj;

        System.out.println(sayıInt);//ClassCastException
    }
}

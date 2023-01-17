package day12_MethodCreatıon;

public class C07_TerseCevırme {

    public static void main(String[] args) {

        // verılen bır strıngı terse cevırıp
        // o halını bıze donduren bır method olusturun

        System.out.println(metnıTerseCevır("java candır"));

    }

    public  static String metnıTerseCevır( String str){
        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr +=str.charAt(i);


        }
        return  tersStr;

    }
}

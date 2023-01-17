package day10_StrıngManıpulatıon;

public class C05_Soru {

    public static void main(String[] args) {


        String str="Evden calısıyorum ,sırkete  gıtmeye gerek yok";

        String calısılacakStr=str.toLowerCase();

        if (calısılacakStr.contains("ev") && calısılacakStr.contains("ıs")){
            System.out.println("hem ev lazım hem ıs");
        } else if (calısılacakStr.contains("ıs")) {
            System.out.println("calısmak guzeldır");

        } else if (calısılacakStr.contains("ev") ) {
            System.out.println("home home swet home");

        }else {
            System.out.println("cok calısman lazım");
        }
    }
}

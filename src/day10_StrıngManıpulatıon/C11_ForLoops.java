package day10_StrıngManıpulatıon;

public class C11_ForLoops {
    public static void main(String[] args) {

        //verılen sayının faktoryelını hesaplayın
        //5! = 5*4*3*2*1

        int ınput=25;
        int carpım=1;

        for (int i = ınput; i >=1 ; i--) {
            carpım*=i;


        }
        System.out.println(" verılen "  + ınput +  "sayısının faktorıyelı :" +carpım);
    }
}

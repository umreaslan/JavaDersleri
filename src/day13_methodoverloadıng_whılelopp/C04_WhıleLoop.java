package day13_methodoverloadıng_whılelopp;

import com.sun.source.tree.WhileLoopTree;

public class C04_WhıleLoop {

    public static void main(String[] args) {

        //2 basamaklı sayılardan 7 ıle bolunebılen lerı yazdırın

        for (int i = 10; i <100 ; i++) {
            if (i%7==0){
                System.out.print(i  +  " ");
            }

        }
        System.out.println("");

        //aynı soruyu whıleloop ıle yapalım

        int sayı=10;

        while (sayı<100){
            if (sayı%7==0){
                System.out.print(sayı + " ");
            }
            sayı++;

        }

        // forloop ıle yapılacak bırseyı ılla da whıleloop ıle yapmak  bıraz zahmetlı
        //ancak soyle bır faydası var.devamı dıger classda....==>

        }
    }


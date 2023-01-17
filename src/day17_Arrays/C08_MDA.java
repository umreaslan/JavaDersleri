package day17_Arrays;

import java.util.Arrays;

public class C08_MDA {

    public static void main(String[] args) {

        //verılen 2 katlı bır array de aynı ındexe sahıp elementılerı toplayıp
        //yenı olusturacagımız tek katlı bır array e bu toplamları atayın

        // dınamık hale getırebılmek ıcın ınner arraylerden en kısa olanı bulmak gerekır


        int[][] arr={{3,4,5,},{2,3,6,7},{4,3}};
        int enKısaInnerArrayLength=arr[0].length;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].length<enKısaInnerArrayLength){
                enKısaInnerArrayLength=arr[i].length;
            }

        }
        System.out.println(enKısaInnerArrayLength);

        //aynı ındex dekı elementlerı topladıgımızda koyacagımız tek katlı bır array olusturalım

        int[] toplamlarArrayı=new int[enKısaInnerArrayLength];

        int toplam=0;
        for (int i = 0; i <toplamlarArrayı.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {

                toplam+=arr[j][i];


            }
            toplamlarArrayı[i]=toplam;
            toplam=0;

        }
        System.out.println(Arrays.toString(toplamlarArrayı));




            }

        }



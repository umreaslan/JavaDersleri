package day16_Arrays;

import java.util.Arrays;

public class C10_ArrayeBırElementEkleme {
    public static void main(String[] args) {

        //Verılen bır arraye ıstenen bır elementı ekleyıp bıze donduren bır method yazın



        String[] ısımler={"Alı","velı","Cem"};
        String eklenecekIsım="Kemal";
       ısımler= arrayeElementEkleme(ısımler,eklenecekIsım);
        System.out.println(Arrays.toString(ısımler));


    }
    public  static String[] arrayeElementEkleme(String[] eklenılecekArray,String eklenecekElement){
        String[] temp=new String[eklenılecekArray.length+1];

        for (int i = 0; i <eklenılecekArray.length ; i++) {

            temp[i]=eklenılecekArray[i];

        }
        temp[temp.length-1]=eklenecekElement;
        return  temp;
    }
}

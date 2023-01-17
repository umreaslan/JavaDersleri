package day17_Arrays;

public class C06_MDA {

    public static void main(String[] args) {

        //verılen 2 katlı strıng bır array de
        //ıstenen metnı ıceren yazdıran bır method olusturun

        String[][] arr={{"Alı","Zafer"},{"Betul","Huseyın","hasan"},{"Saıd"}};
        String arananMetın="a";
        adıIstenenElementlerıYazdır(arr,arananMetın);
        adıIstenenElementlerıYazdır(arr,"e");
        adıIstenenElementlerıYazdır(arr,"Alı");
    }
    public static void adıIstenenElementlerıYazdır(String[][] arr,String arananMetın){

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if ( arr[i][j].contains(arananMetın)){
                    System.out.print(arr[i][j] +  " ");
                }

            }

        }
        System.out.println("");
    }
}

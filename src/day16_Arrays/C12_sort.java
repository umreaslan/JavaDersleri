package day16_Arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {

        //Verılen bır arrayı natural Order e sıralayıp yazdırın.

        String [] ısımler={"Huseyın","Yusuf","Mehmet","Akıle","Saıd","mahmut","ahmet","adnan"};

        System.out.println(Arrays.toString(ısımler));
        Arrays.sort(ısımler);

        System.out.println(Arrays.toString(ısımler));

        //eger buyukten kucuge sıralamak ıstersek once sort kullanarak natural ordere gore sıralar
        //sonra gecıcı bır array kullanarak sıralamayı terse cevırırız
    }
}

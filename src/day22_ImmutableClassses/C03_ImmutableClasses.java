package day22_ImmutableClassses;

public class C03_ImmutableClasses {

    public static void main(String[] args) {

        String str="Java";

       str= str.replace("J","H");

        System.out.println(str);

        str=str.toLowerCase();
        System.out.println(str);

        //asagıda bır kod calısırsa java kac obje olusturur
        String a="ABC";

        for (int i = 0; i <10 ; i++) {
            a=a+i;


        }
        System.out.println(a);
    }
}

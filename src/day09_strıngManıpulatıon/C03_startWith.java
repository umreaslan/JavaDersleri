package day09_strıngManıpulatıon;

public class C03_startWith {
    public static void main(String[] args) {

        String str="Java mutluluktur";
        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("j"));
        System.out.println(str.startsWith("Java mutluluktur"));
        System.out.println(str.startsWith(""));
        System.out.println(str.startsWith("mutlu"));//baslar mı?
        System.out.println(str.contains("mutlu"));// ıcerır mı?

        System.out.println(str.startsWith("mutlu",5)); //true
        System.out.println(str.startsWith("va",2));//true

        System.out.println(str.startsWith("v",2));

    }
}

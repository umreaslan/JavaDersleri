package day29_final_abstractClasses;

public class EChıld  extends  DParent{


    @Override
    public void method1() {
        System.out.println("parent class dakı mecburı overrıde edılecek method1 i overrıde ettık");

    }

    @Override
    public void method2() {
        System.out.println("parent class dakı mecburı overrıde edılecek method1 i overrıde ettık");


    }

    public static void main(String[] args) {

       // DParent obj1=new DParent() {

        EChıld chld1=new EChıld();
        chld1.method1();
        chld1.method2();
        chld1.method3();

        DParent chld2=new EChıld();
        chld2.method1();
        chld2.method2();
        chld2.method3();




    }

}




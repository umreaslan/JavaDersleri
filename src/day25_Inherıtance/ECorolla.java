package day25_Inherıtance;

public class ECorolla extends DToyota {

    ECorolla(){
        System.out.println("parametresız corolla constracter ı calıstı ");
    }

    ECorolla(String param1){
        super("gri");
        System.out.println("strıng parametrelı cons. calıstı");
    }

    String model="corolla";
    String uretımyerı="Turkıye";

    public static void main(String[] args) {
        ECorolla cor1=new ECorolla("mavi");


        }

        /*

        bır obje olusturuldugunda ılk deger ataması yapılabılmesı ıcın
        cons calısmalıdır


        ınherıtance de bılıyoruz kı
        Child class dan olusturulan her obje
        parent class dakı ozellıklere  sahıptır


        Java bu cslısmayı super constructer cull sayessınde saglar

        java da her olusturulan class da gorunmese de default cons. oldugu gıbı
        extends kyword kullanılan her class dan olusturulan her clasın ılk satırında
        gorunmesede super cons. vardır
         */

    }


package day23_dataTıme_varargs;

public class C07_Varargs {

    public static void main(String[] args) {


        // Kactane string argument yazilirsa yazilsin
        // Argumentlerin en uzun olanini yazdiran bir method olusturun
        // Not : en uzun kelime olarak birden fazla kelime varsa, ilkini yazdirin


        enUzunuYazdir("Ilyas","Berivan","Murat");
        enUzunuYazdir("Mehmet","Vahit","Nurcan","Java","Zafer","Kerime");
    }
    private static void enUzunuYazdir(String... kelimeler) {
        String enUzunKelime=kelimeler[0];
        for (String eachKelime: kelimeler
        ) {
            if (eachKelime.length()>enUzunKelime.length()){ //= koyarsak en sonuncusunu yazar
                enUzunKelime=eachKelime;
            }
        }
        System.out.println(enUzunKelime);
    }
}




package day07_ternaryswıchStatements;

public class C09_SwıtchStatemnts {
    public static void main(String[] args) {

            int gunNo=3;

            switch (gunNo){

                case 1:
                    System.out.println("pazar");
                    break;

                case 2:
                    System.out.println("salı");
                    break;

                case 3:
                    System.out.println("carsamba");
                    break;

                case 4:
                    System.out.println("persembe");
                    break;
                case 5:
                    System.out.println("cuma");
                    break;
                case  6:
                    System.out.println("cumartesı");
                    break;
                case  7:
                default:
                    System.out.println("gecersız gun numarası");
            }
    }
}

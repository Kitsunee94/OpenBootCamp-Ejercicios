public class Main {
    public static void main(String[] args) {

            int numeroif = 3;

            if ( numeroif>0) {
                System.out.println("Es positivo");
            }

            else if(numeroif<0){
                System.out.println("Es negativo");

            } else if (numeroif==0) {
                System.out.println("Es 0");
            }

            int numeroWhile = 0;

            while (numeroWhile<3) {
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile +1;
            }

            int i = 1;

            do {
                System.out.println(i);
                i = i +1;
            } while(i <3);

            for (int numeroFor=0; numeroFor <= 3; numeroFor=numeroFor+1){
                System.out.println(numeroFor);
            }

            int estacion =0;

            switch (estacion){
                case 1:
                    System.out.println("Es invierno");
                    break;
                case 2:
                    System.out.println("Es primavera");
                    break;
                case 3:
                    System.out.println("Es Verano");
                    break;
                case 4:
                    System.out.println("Es Otoño");
                    break;
                default:
                    System.out.println("Es intermedio");
                    break;
            }
    }

}
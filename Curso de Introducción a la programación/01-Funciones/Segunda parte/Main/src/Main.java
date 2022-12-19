
class Coche {
    public int puertas= 4;

    public void PonerPuerta() {
        this.puertas++;
    }
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.PonerPuerta();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b) {
        return a + b;
    }
}
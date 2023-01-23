package bucles;

public class Lista {
    public static void main(String[] args) {
        String[] nombres = new String[]{"Carles ", "Bea ", "Joan    ", "Maria   ", "Pau "};
        for (String nombre : nombres) {
            System.out.print(nombre);
        }
    }
}
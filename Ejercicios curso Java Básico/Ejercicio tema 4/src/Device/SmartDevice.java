package Device;

public class SmartDevice {
    //1. atributos
    String fabricante;
    String modelo;
    String color;
    double pulgadas;
    boolean tactil;
    double precio;



    //2.Constructores
    public SmartDevice(){

    }

    public SmartDevice(String fabricante, String modelo, String color, double precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }
}

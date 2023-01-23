package Device;

public class SmartDevice {
    //1. atributos
    String fabricante;
    String modelo;
    String color;
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

    @Override
    public String toString() {
        return "SmartDevice{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}

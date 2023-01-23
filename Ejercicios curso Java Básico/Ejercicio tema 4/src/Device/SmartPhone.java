package Device;

public class SmartPhone extends SmartDevice{
    boolean llamadas;
    boolean hacerFotos;
    boolean gps;

    public SmartPhone(){


    }
    public SmartPhone(String fabricante, String modelo, String color, double precio, Boolean llamadas, boolean hacerFotos, boolean gps) {
        super(fabricante, modelo, color, precio);
        this.llamadas = llamadas;
        this.hacerFotos = hacerFotos;
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "llamadas=" + llamadas +
                ", hacerFotos=" + hacerFotos +
                ", gps=" + gps +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}

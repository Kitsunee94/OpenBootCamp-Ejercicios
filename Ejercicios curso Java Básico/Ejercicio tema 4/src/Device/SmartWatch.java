package Device;

public class SmartWatch extends SmartDevice {

    boolean podomoetro;
    boolean manosLibres;
    boolean sueño;
    boolean reproductorMusica;


    public SmartWatch(){

    }

    public SmartWatch(String fabricante, String modelo, String color, double precio, boolean podomoetro, boolean manosLibres, boolean sueño, boolean reproductorMusica) {
        super(fabricante, modelo, color, precio);
        this.podomoetro = podomoetro;
        this.manosLibres = manosLibres;
        this.sueño = sueño;
        this.reproductorMusica = reproductorMusica;
    }
}

public class Main {
    public static void main(String[] args) {

    Cliente cliente =new Cliente();

    cliente.edad();
    cliente.telefono();
    cliente.nombre();
    cliente.credito();

    }
}
class Persona{
    public void edad(){
        System.out.println("28 años");
    }
    public void nombre(){
        System.out.println("Carles");
    }
    public void telefono(){
        System.out.println("99988877");
    }
}
class Cliente extends Persona {
    public void credito(){
        System.out.println("Esto es credito");
    }
}
class Trabajador extends Cliente {
    public void salario(){
        System.out.println("1000€");
    }
}
package Device;

public class Main {
    public static void main(String[] args) {
        SmartPhone huaweiPSmart2020 = new SmartPhone("Huawei", "PSmart2020","Green",199.99d,true,true,true);
        System.out.println(huaweiPSmart2020);
        SmartWatch xiaomiSmartBand7Pro = new SmartWatch("Xiaomi","Smart Band 7 Pro","black",99.99d,true, true, true,true);
        System.out.println(xiaomiSmartBand7Pro);

        System.out.println("Fin de ejercicio");
    }
}

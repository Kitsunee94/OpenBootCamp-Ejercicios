package coche;

public class Main {

    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDimpl();
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
        System.out.println(cocheCRUD);
    }
}

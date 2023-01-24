package coche;

public class Main {
    static CocheCRUD cocheCRUD = new CocheCRUDimpl();
    public static void main(String[] args) {

        cocheCRUD.save( new CocheCRUDimpl());
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}

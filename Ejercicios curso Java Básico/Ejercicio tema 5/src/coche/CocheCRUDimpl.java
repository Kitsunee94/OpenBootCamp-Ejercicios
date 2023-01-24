package coche;

public class CocheCRUDimpl implements CocheCRUD{


    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }
    String save ="Guardando";
    String findAll ="Consultando";
    String delete ="Borrando";

    @Override
    public String toString() {
        return "CocheCRUDimpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}

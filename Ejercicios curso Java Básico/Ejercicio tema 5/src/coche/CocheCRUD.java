package coche;

public interface CocheCRUD {

    void save(CocheCRUDimpl cocheCRUDimpl);
    void findAll(CocheCRUDimpl cocheCRUDimpl);
    void delete(CocheCRUDimpl cocheCRUDimpl);

    void findAll();

    void delete();
}

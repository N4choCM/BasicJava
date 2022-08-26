package Activity5;

public class CarCRUDImpl implements CarCRUD{
    @Override
    public void save() {
        System.out.println("Saving...");
    }

    @Override
    public void findAll() {
        System.out.println("Finding all the cars...");
    }

    @Override
    public void delete() {
        System.out.println("Deleting cars...");
    }
}

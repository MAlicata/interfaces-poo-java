package interfaces;

public class Main {
    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();
    public static void main(String[] args) {

        empleadoCRUD.findAll();

    }
}

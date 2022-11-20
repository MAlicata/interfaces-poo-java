package sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        Empleado juanito = new Empleado("Juanito", 30, 40, true);
        Empleado matias = new Empleado("Matias", 30, 40, true);
        Empleado jesus = new Empleado("Jesus", 30, 40, true);

        System.out.println(juanito);

        empleadoCRUD.save(juanito);
        empleadoCRUD.save(matias);
        empleadoCRUD.save(jesus);

        // consultar empleados
        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);


    }
}

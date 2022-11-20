package sininterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {
    //estructura de datos
    private List<Empleado> empleados = new ArrayList<>();

    // crud
    // guardar un empleado
    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }
}

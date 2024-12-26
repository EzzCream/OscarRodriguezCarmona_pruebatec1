package persistencia;

import logica.Empleado;
import persistencia.exceptions.NonexistentEntityException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {
    EmpleadoJpaController empleado = new EmpleadoJpaController();

    public void crearEmpleado(Empleado emp) {
        empleado.create(emp);
    }

    public List<Empleado> obtenerEmpleado(String cargo) {
        return empleado.findByCargo(cargo);
    }

    public void eliminarEmpleado(int id) {
        try{
            empleado.destroy(id);
        }catch (NonexistentEntityException ex){
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Empleado traerEmpleado (int id) {
        return empleado.findEmpleado(id);
    }

    public List<Empleado> traerEmpleados(){
        return empleado.findEmpleadoEntities();
    }

    public void modificarEmpleado(Empleado emp) {
        try {
            empleado.edit(emp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

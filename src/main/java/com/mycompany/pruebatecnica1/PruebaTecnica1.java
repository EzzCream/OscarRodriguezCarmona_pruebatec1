package com.mycompany.pruebatecnica1;

import logica.Empleado;
import persistencia.ControladorPersistencia;
import vista.Menu;

import java.util.List;
import java.util.Scanner;

public class PruebaTecnica1 {

    public static void main(String[] args) {
        ControladorPersistencia controladorPer = new ControladorPersistencia();
        Menu menu = new Menu();
        int opcion = 0;
        do {
            menu.mostrarMenu();
            try {
                Scanner sc = new Scanner(System.in);
                opcion = sc.nextInt();
            }catch (Exception ignored) {
            }
            switch (opcion) {
                case 1:
                    System.out.println("\n⏩ Crear Empleado.\n");
                    controladorPer.crearEmpleado(menu.ingresarEmpleado(0));
                    menu.regresarMenu();
                    break;
                case 2:
                    System.out.println("\n⏩ Listar Empleados.\n");
                    List<Empleado> listaEmpleados = controladorPer.traerEmpleados();
                    menu.listarEmpleados(listaEmpleados);
                    menu.regresarMenu();
                    break;
                case 3:
                    System.out.println("\n⏩ Actualizar información de un empleado.\n");
                    Empleado empleado = controladorPer.traerEmpleado(menu.buscarEmpleado());
                    System.out.println("El empleado a actualizar es: ");
                    menu.mostrarEmpleado(empleado);
                    System.out.println("Ingrese la nueva informacion");
                    controladorPer.modificarEmpleado(menu.ingresarEmpleado(empleado.getId()));
                    System.out.println("El empleado se ha actualizado correctamente");
                    menu.regresarMenu();
                    break;
                case 4:
                    System.out.println("\n⏩ Eliminar un empleado.\n");
                    Empleado empleadoEliminar = controladorPer.traerEmpleado(menu.buscarEmpleado());
                    System.out.println("El empleado a eliminar es: ");
                    menu.mostrarEmpleado(empleadoEliminar);
                    int validacion = menu.validar();
                    if (validacion == 1) {
                        controladorPer.eliminarEmpleado(empleadoEliminar.getId());
                        System.out.println("El empleado se ha eliminado correctamente");
                    }else{
                        System.out.println("El empleado no se ha eliminado");
                    }
                    menu.regresarMenu();
                    break;
                case 5:
                    System.out.println("\n⏩ Listar empleado por cargo.\n");
                    System.out.print("Ingrese el cargo para buscar a los empleados: ");
                    Scanner sc = new Scanner(System.in);
                    String cargo = sc.nextLine();
                    menu.listarEmpleados(controladorPer.obtenerEmpleado(cargo));
                    menu.regresarMenu();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
        }while (opcion != 6);{
            System.out.println("Gracias, hasta luego");
        }
    }
}

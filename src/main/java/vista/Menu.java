package vista;

import logica.Empleado;
import utils.FechaUtil;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void mostrarMenu() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║       🌟 GESTIÓN DE EMPLEADOS 🌟        ║");
        System.out.println("╠═════════════════════════════════════════╣");
        System.out.println("║ 1️⃣  Crear Empleado                      ║");
        System.out.println("║ 2️⃣  Listar Empleados                    ║");
        System.out.println("║ 3️⃣  Modificar Empleado                  ║");
        System.out.println("║ 4️⃣  Eliminar Empleado                   ║");
        System.out.println("║ 5️⃣  Buscar Empleado                     ║");
        System.out.println("║ 6️⃣  Salir                               ║");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.print("Selecciona una opción: ");
    }
    public void regresarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tarea realizada");
        System.out.println("Presiona Enter para continuar...");
        sc.nextLine();
    }
    public Empleado ingresarEmpleado(int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del empleado");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el cargo del empleado");
        String cargo = sc.nextLine();
        System.out.println("Ingrese el salario del empleado");
        double salario = sc.nextDouble();
        LocalDate fecha = FechaUtil.fechaFormato();
        return new Empleado(id, nombre, apellido, cargo, salario, fecha);
    }
    public void listarEmpleados(List<Empleado> listaEmpleados) {
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getApellido() + " ║ Cargo: " + empleado.getCargo() + " ║ Salario: " + empleado.getSalario() + " ║ Fecha ingreso: " + empleado.getFechaInicio());
            System.out.println("══════════════════════════════════════════════════════════════════════════════════");
        }
    }
    public int buscarEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el ID del empleado: ");
        return sc.nextInt();
    }
    public void mostrarEmpleado(Empleado empleado) {
        System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getApellido() + " ║ Cargo: " + empleado.getCargo() + " ║ Salario: " + empleado.getSalario() + " ║ Fecha ingreso: " + empleado.getFechaInicio());
        System.out.println("══════════════════════════════════════════════════════════════════════════════════");
    }
    public int validar() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║      ¿Desea realizar esta accion?       ║");
        System.out.println("╠═════════════════════════════════════════╣");
        System.out.println("║ 1️⃣  SI                                  ║");
        System.out.println("║ 2️⃣  NO                                  ║");
        System.out.println("╚═════════════════════════════════════════╝");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Empleado.Diseñador;
import Empleado.Empleado;
import Empleado.Programador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Olalla SB
 */
public class Controller {
    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Empleado> Empleado = new ArrayList<>();
    public static void obtenerEmpleado() {
        
    }

    public static void altaEmpleado() {
    System.out.println("DNI: ");
    int DNI = sc.nextInt();
    sc.nextLine();
    
    System.out.println("Nombre: ");
    String nombre = sc.nextLine();
    
    System.out.println("Salario: ");
    double salario = sc.nextDouble();

    System.out.println("lenguajePrincipal: ");
    String lenguajePrincipal = sc.nextLine();

    System.out.println("Herramienta de Diseño");
    String herramientaDiseño = sc.nextLine();
    
    Empleado.add(new Empleado(DNI, nombre, salario, herramientaDiseño, lenguajePrincipal));
    System.out.println("Empleado añadido correctamente");

    
    
    }

    public static void listaEmpleado() {
    if (Empleado.isEmpty()) {
        System.out.println("No hay empleados.");
    } else {
        System.out.println("\nLista de empleados:");
        for (Empleado v : Empleado) {
            System.out.println(v);   
            }
        }
    }
    public static void modificarEmpleado() {
    }
    
}

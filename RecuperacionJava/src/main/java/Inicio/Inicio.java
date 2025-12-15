/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inicio;

import Controller.Controller;
import MyApi.MyApi;

/**
 *
 * @author Olalla SB
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        
        do {
            MyApi.menu(
                    "\n--- MENÚ PRINCIPAL ---",
                    "1. Obtener un empleado segun un DNI:",
                    "2. Alta de empleado:",
                    "3. Listado de empleados:",
                    "4. Modificacion de empleado:",
                    "5. Salir"
            );
            
            opcion = MyApi.pedirEnteroPositivo(1, 4,
                    "Seleccione una opción (1-4): ");
            
            switch (opcion) {
                case 1:
                    Controller.obtenerEmpleado();
                    break;
                
                case 2:
                    Controller.altaEmpleado();
                    break;
                
                case 3:
                    Controller.listaEmpleado();
                    break;
                
                case 4:
                    Controller.modificarEmpleado();
                    break;
                
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
            }
            
        } while (opcion != 4);
    }
}
    


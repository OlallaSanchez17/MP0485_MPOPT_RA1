/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author Olalla SB
 */
public class Programador extends Empleado{
    public String lenguajePrincipal;

    public Programador(String lenguajePrincipal, int DNI, String nombre, double salario, double salarioBase, double complementos) {
        super(DNI, nombre, salario, salarioBase, complementos);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public Programador(String lenguajePrincipal, double salarioBase, double complementos) {
        super(salarioBase, complementos);
        this.lenguajePrincipal = lenguajePrincipal;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Programador{");
        sb.append("Nombre ").append(nombre);
        StringBuilder append = sb.append("DNI ").append(DNI);
        sb.append("Salario ").append(salario);
        sb.append("lenguajePrincipal=").append(lenguajePrincipal);
        sb.append('}');
        return sb.toString();
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double Salario) {
        this.salario = Salario;
    }


    
}

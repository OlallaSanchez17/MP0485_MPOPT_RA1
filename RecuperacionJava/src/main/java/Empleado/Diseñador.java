/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author Olalla SB
 */
public class Diseñador extends Empleado{
    public String herramientaDisenio;

    public Diseñador(String herramientaDisenio, int DNI, String nombre, double salario, double salarioBase, double complementos) {
        super(DNI, nombre, salario, salarioBase, complementos);
        this.herramientaDisenio = herramientaDisenio;
    }

    public Diseñador(String herramientaDisenio, double salarioBase, double complementos) {
        super(salarioBase, complementos);
        this.herramientaDisenio = herramientaDisenio;
    }


    
    public String getHerramientaDisenio() {
        return herramientaDisenio;
    }

    public void setHerramientaDisenio(String herramientaDisenio) {
        this.herramientaDisenio = herramientaDisenio;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComplementos() {
        return complementos;
    }

    public void setComplementos(double complementos) {
        this.complementos = complementos;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Programador{");
        sb.append("Nombre ").append(nombre);
        StringBuilder append = sb.append("DNI ").append(DNI);
        sb.append("Salario ").append(salario);
        sb.append("Complementos: "). append(complementos);
        sb.append("herramientaDisenio=").append(herramientaDisenio);
        sb.append('}');
        return sb.toString();
    }

    
    
}

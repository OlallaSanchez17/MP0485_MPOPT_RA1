/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

import Salario.Salario;
import java.util.Objects;

/**
 *
 * @author Olalla SB
 */
public class Empleado extends Salario{
    public int DNI;
    public String nombre;
    public double salario;

    public Empleado(int DNI, String nombre, double salario, double salarioBase, double complementos) {
        super(salarioBase, complementos);
        this.DNI = DNI;
        this.nombre = nombre;
        this.salario = salario;
    }



    public Empleado(double salarioBase, double complementos) {
        super(salarioBase, complementos);        
    }




    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", nombre=" + nombre + ", salario=" + salario + '}';
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.DNI != other.DNI) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }





}

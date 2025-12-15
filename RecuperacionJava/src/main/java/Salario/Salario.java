/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Salario;

/**
 *
 * @author Olalla SB
 */
public class Salario {
    public double salarioBase;
    public double complementos;



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

    public Salario(double salarioBase, double complementos) {
        this.salarioBase = salarioBase;
        this.complementos = complementos;
    }
    
    public void calcularSalarioTotal(){
        salarioBase = salarioBase + complementos;
    }

    @Override
    public String toString() {
        return "Salario{" + "salarioBase=" + salarioBase + ", complementos=" + complementos + '}';
    }
    
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ister.edu.ec.Modelo;

/**
 *
 * @author LAB
 */
public class Persona {
    private String cedula;
    private String nombre;
    private String fechaNacimiento;

    public Persona(String cedula, String nombre, String fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
public String toString(){

return "Nombre:"+getNombre()+"\n"+"Cedula:"+getCedula()+"\n"+"fecha"+getFechaNacimiento();
}    
    
    
}

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
public class Estudiante extends Persona {
    private String idEstudiante;
    private double notas;

    public Estudiante(String idEstudiante, double notas, String cedula, String nombre, String fechaNacimiento) {
        super(cedula, nombre, fechaNacimiento);
        this.idEstudiante = idEstudiante;
        this.notas = notas;
    }
            
            }

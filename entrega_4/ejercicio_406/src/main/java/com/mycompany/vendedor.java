package com.mycompany;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author daniel
 */
public class vendedor {
    String nombre;
    String apellido;
    int edad;

    vendedor(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    void verificarEdad(int edad){
        if (edad < 18){
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años.");
        }if (edad >= 0 && edad <= 120){
            this.edad = edad;
        }else{
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120 años.");
        }
    }

    
}

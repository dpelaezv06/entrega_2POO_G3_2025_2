/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_1;

/**
 *
 * @author daniel
 */

/* Esta clase contiene informacion acerca de objetos del tipo persona.
 * Los atributos de persona son: Nombre, apellidos, numero de documento y año de nacimiento
 */
public class persona { //creacion del objeto tipo persona
    String nombre;      // nombre de la persona
    String apellidos;    // apellido de la persona
    String numero_documento; //numero de documento de identificacion de la persona, se guarda como string para evitar overflow
    int nacimiento; // el año de nacimiento de la persona
    String pais; // el pais de nacieminto de la persona
    char genero; // el genero de la persona


    /* Constructor de la clase persona */
    persona(String nombre, String apellidos, String numero_documento, int nacimiento, String pais, char genero){ //constructor de la clase
        /* se asigna el valor correspondiente a cada atributo */
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numero_documento = numero_documento;
        this.nacimiento = nacimiento;
        this.pais = pais;
        this.genero = genero;
    }

    /* metodo para imprimir en consola los atributos del objeto persona */
    void imprimir(){
        /* se imprime por consola todos los atributos del objeto persona con un string acompañandolo por un string que lo
         * identifica
         */
        System.out.println("Nombre: " + nombre); 
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Numero de documento: " + numero_documento);
        System.out.println("Año de nacimiento: " + nacimiento);
        System.out.println("Pais de nacimiento: " + pais);
        System.out.println("Genero: " + genero);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_1;

/**
 *
 * @author daniel
 */
public class Ejercicio2_1 {

    
    public static void main(String[] args) {
        persona persona_1 = new persona("Pedro", "Perez", "1053121010", 1998, "Colombia", 'H'); // creacion del objeto persona_1
        persona persona_2 = new persona("Luis", "Leon", "1053223344", 2001, "Uruguay", 'H'); // creacion del objeto persona_2
        persona_1.imprimir(); // mostrar en consola los atributos de la persona 1
        persona_2.imprimir(); // mostrar en consola los atributos de la persona 2
    }
}

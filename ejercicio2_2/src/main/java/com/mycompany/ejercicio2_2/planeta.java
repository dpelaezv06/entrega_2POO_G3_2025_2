/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_2;

/**
 *
 * @author daniel
 */

 /* esta clase contiene la definicion, el constructor y los atributos de los objetos de tipo planeta */
public class planeta {

    enum tipos_planetas {GASEOSO, TERRESTRE, ENANO}; // enumeracion para determinar el tipo de planeta

    /* definicion de los atributos de planeta */
    String nombre = null; // el nombre del planeta
    int satelites = 0; // cantidad de satelites del planeta
    double masa = 0; // masa en kilogramos del planeta
    double volumen = 0; // volumen del planeta en kilometros cubicos
    int diametro = 0; // diametro del planeta en kilometros
    int distancia_sol = 0; // distancia entre el planeta y el sol en millones de kilometros
    tipos_planetas tipo; // tipo de planeta entre gaseoso, terreste o enano
    boolean observable = false; // el planeta es o no observable a simple vista
    
    /* constructor de objetos del tipo planeta */
    planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distancia_sol, tipos_planetas tipo, 
    boolean observable){
        /* el constructor inicializa los atributos del objeto planeta */
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia_sol = distancia_sol;
        this.tipo = tipo;
        this.observable = observable;
    }

}

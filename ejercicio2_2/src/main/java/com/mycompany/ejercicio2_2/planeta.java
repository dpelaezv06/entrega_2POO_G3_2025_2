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
    boolean exterior = false; //atributo booleano para saber si el planeta ees exterior
    double densidad = 0; // atributo para guardar la densidad de un planeta
    
    /* constructor de objetos del tipo planeta */
    planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distancia_sol, tipos_planetas tipo, boolean observable){
        /* el constructor inicializa los atributos del objeto planeta */
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia_sol = distancia_sol;
        this.tipo = tipo;
        this.observable = observable;
        this.exterior = planeta_exterior();
        this.densidad = calcular_densidad();
    }

    private double calcular_densidad(){
        double densidad;
        densidad = masa/volumen; // calculo de la densidad del planeta en kilogramos / kilometros cubicos
        return densidad;
    }

    private boolean planeta_exterior(){
        double limite = 3.4 * 149597870; // limite superior de la existencia del cinturon de asteriodes
        if (distancia_sol >= limite){
            return true;

        } else{
            return false;

        }
    }

    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de satelites: " + satelites);
        System.out.println("Masa en kilogramos: " + masa);
        System.out.println("Volumen en kilometros cubicos: " + volumen);
        System.out.println("Diametro en kilometros: " + diametro);
        System.out.println("Distancia promedio al sol en millones de kilometros: " + distancia_sol);
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Es observable a simple vista: " + observable);
        System.out.println("Densidad en km*(km^-3): " + densidad);
        System.out.println("Es un planeta exterior: " + exterior);
    }

}

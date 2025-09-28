/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_3;

import com.mycompany.ejercicio2_3.automovil.color;
import com.mycompany.ejercicio2_3.automovil.combustible;
import com.mycompany.ejercicio2_3.automovil.tipo_automovil;

/**
 *
 * @author daniel
 */
public class Ejercicio2_3 {

    public static void main(String[] args) {
        automovil carro = new automovil("Ford", 2018, 3, combustible.DIESEL, tipo_automovil.EJECUTIVO, 5, 6, 250, color.NEGRO);

        carro.imprimir();
        carro.setVelocidadActual(100);
        System.out.println("Velocidad actual (km/h): " + carro.velocidad_actual);
        carro.acelerar(20);
        System.out.println("Velocidad actual (km/h): " + carro.velocidad_actual);
        carro.frenar(50);
        System.out.println("Velocidad actual (km/h): " + carro.velocidad_actual);
        carro.detener();
        System.out.println("Velocidad actual (km/h): " + carro.velocidad_actual);
        carro.frenar(20);

    }
}

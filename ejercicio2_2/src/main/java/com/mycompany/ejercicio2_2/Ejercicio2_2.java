/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_2;

import com.mycompany.ejercicio2_2.planeta.tipos_planetas;

/**
 *
 * @author daniel
 */
public class Ejercicio2_2 {

    public static void main(String[] args) {
        /* Creamos 2 objetos del tipo planeta */

        planeta tierra = new planeta("Tierra", 1,  5.9722E24, 1.08321E12 , 12742, 14960000, tipos_planetas.TERRESTRE, true);
        planeta marte = new planeta("Marte", 2,  6.4185E23, 1.6318E11 , 6794, 227392100, tipos_planetas.TERRESTRE, true);
        tierra.imprimir();
        marte.imprimir();
    }
}

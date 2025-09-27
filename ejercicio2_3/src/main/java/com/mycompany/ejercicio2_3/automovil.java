/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2_3;

/**
 *
 * @author daniel
 */
public class automovil {

    enum combustible{
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    };

    enum tipo_automovil{
        CARRO_DE_CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    };

    enum color{
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    };


    /* atributos de los objetos tipo automovil */
    String marca; // marca del automovil
    short modelo; // año de fabricacion
    float motor; // cilindrada en litros del motor
    combustible tipo_combustible; // tipo de combustible del automovil
    tipo_automovil automovil; // tipo de vehiculo
    byte numero_puertas; // numero de puertas del automovil
    byte cantidad_asientos; // numero de asientos en el automovil
    short velocidad_maxima; // la velocidad maxima alcanzada por el vehiculo
    color color_vehiculo; // el color del automovil
    short velocidad_actual; // velocidad actual del vehiculo

    automovil(String marca, short modelo, float motor, combustible tipo_combustible, tipo_automovil automovil,
    byte numero_puertas, byte cantidad_asientos, short velocidad_maxima, color color_vehiculo){

        /* constructor de los objetos del tipo automovil */
    
    this.marca = marca;
    this.modelo = modelo;
    this.motor = motor;
    this.tipo_combustible = tipo_combustible;
    this.automovil = automovil;
    this.numero_puertas = numero_puertas;
    this.cantidad_asientos = cantidad_asientos;
    this.velocidad_maxima = velocidad_maxima;
    this.color_vehiculo = color_vehiculo;
    this.velocidad_actual = 0;

    }

    String getMarca(){
        return marca;
    }

    short getModelo(){
        return modelo;
    }

    float getMotor(){
        return motor;
    }

    combustible getCombustible(){
        return tipo_combustible;
    }

    tipo_automovil getTipoAutomovil(){
        return automovil;
    }

    byte numero_puertas(){
        return numero_puertas;
    }

    byte cantidad_asientos(){
        return cantidad_asientos;
    }

    short getVelocidadMaxima(){
        return velocidad_maxima;
    }

    color getColor(){
        return color_vehiculo;
    }

    short getVelocidadActual(){
        return velocidad_actual;
    }

    public void leer_velocidad(){

    }


    
    


}

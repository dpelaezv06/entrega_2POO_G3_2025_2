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

    /* metodos get para obtener los atributos de los objetos de tipo vehiculo */

    public String getMarca(){
        return marca;
    }

    public short getModelo(){
        return modelo;
    }

    public float getMotor(){
        return motor;
    }

    public combustible getCombustible(){
        return tipo_combustible;
    }

    public tipo_automovil getTipoAutomovil(){
        return automovil;
    }

    public byte numero_puertas(){
        return numero_puertas;
    }

    public byte cantidad_asientos(){
        return cantidad_asientos;
    }

    public short getVelocidadMaxima(){
        return velocidad_maxima;
    }

    public color getColor(){
        return color_vehiculo;
    }

    public short getVelocidadActual(){
        return velocidad_actual;
    }

    /* metodos set para cambiar los atributos del objeto automovil */
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(short modelo){
        this.modelo = modelo;
    }

    public void setMotor(float motor){
        this.motor = motor;
    }

    public void setCombustible(tipo_combustible combustible){
        this.tipo_combustible = combustible;
    }

    public void setTipoAutomovil(tipo_automovil automovil){
        this.automovil = automovil;
    }

    public void setNumeroPuertas(byte numero_puertas){
        this.numero_puertas = numero_puertas;
    }

    public void setCantidadAsientos(byte asientos){
        this.cantidad_asientos = asientos;
    }

    public void setVelocidadMaxima(short velocidad){
        this.velocidad_maxima = velocidad;
    }

    public void setColor(color color){
        this.color_vehiculo = color;
    }

    public void setVelocidadActual(short velocidad){
        if (velocidad < 0){
            System.out.println("La velocidad no puede ser negativa");            
        }else if (velocidad > velocidad_maxima){
            System.out.println("La velocidad no puede ser superior a la maxima"); 
        }else{
            this.velocidad_actual = velocidad;
        }
    }

    /* metodos para aumentar y disminuir la velocidad actual */

    public void acelerar(short incremento_velocidad){
        /* metodo para aumentar la velocidad */

        short velocidad; // variable para guardar la velocidad nueva luego del incremento

        velocidad = velocidad_actual + incremento_velocidad; //se calcula la nueva velocidad tras el incremento
        if (velocidad > velocidad_maxima){
            System.out.println("El incremento solicitado excede la velocidad maxima");
        }else{
            velocidad_actual = velocidad; // en otro caso, el incremento es permitido, y se guarda el nuevo valor de velocidad
        }
    }

    public void frenar(short decremento){
        /* metodo para decrementar la velocidad actual */
        if (decremento > velocidad_actual){ // caso que se solicite decrementar mas de la velocidad actual
            System.err.println("El decremento solicitado resultaria en una velocidad negativa");

        }else{ // en caso contrario el decremento solicitado es valido
            velocidad_actual = velocidad_actual - decremento;
        }
    }

    public void detener(){
        /* metodo para poner la velocidad en cero */
        velocidad_actual = 0;
    }

    public double tiempo_llegada(double distancia){
        /* metodo para estimar el tiempo de llegada a la velocidad actual segun una distancia */
        double tiempo = distancia/velocidad_actual; // calculo del tiempo
        return tiempo;        
    }

    public void imprimir(){
        /* metodo para visualizar en pantalla los atributos de los objetos tipo automovil */

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindrada del motor (en litros): " + motor);
        System.out.println("Tipo de combustible: " + tipo_combustible);
        System.out.println("Tipo de automovil: " + automovil);
        System.out.println("Numero de puertas: " + numero_puertas);
        System.out.println("Numero de asientos: " + cantidad_asientos);
        System.out.println("Velocidad maxima (en km/h): " + velocidad_maxima);
        System.out.println("Color: " + color_vehiculo);
    }




}

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

    enum transmision{AUTOMATICA, MANUAL};


    /* atributos de los objetos tipo automovil */
    String marca; // marca del automovil
    int modelo; // año de fabricacion
    int motor; // cilindrada en litros del motor
    combustible tipo_combustible; // tipo de combustible del automovil
    tipo_automovil automovil; // tipo de vehiculo
    int numero_puertas; // numero de puertas del automovil
    int cantidad_asientos; // numero de asientos en el automovil
    int velocidad_maxima; // la velocidad maxima alcanzada por el vehiculo
    color color_vehiculo; // el color del automovil
    int velocidad_actual; // velocidad actual del vehiculo
    transmision transmision; // transmision automatica o manual
    int multas; // cantidad de multas impuestas

    automovil(String marca, int modelo, int motor, combustible tipo_combustible, tipo_automovil automovil,
    int numero_puertas, int cantidad_asientos, int velocidad_maxima, color color_vehiculo, transmision transmision){

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
    this.transmision = transmision;
    this.multas = 0;
    }

    /* metodos get para obtener los atributos de los objetos de tipo vehiculo */

    public String getMarca(){
        return marca;
    }

    public int getModelo(){
        return modelo;
    }

    public int getMotor(){
        return motor;
    }

    public combustible getCombustible(){
        return tipo_combustible;
    }

    public tipo_automovil getTipoAutomovil(){
        return automovil;
    }

    public int numero_puertas(){
        return numero_puertas;
    }

    public int cantidad_asientos(){
        return cantidad_asientos;
    }

    public int getVelocidadMaxima(){
        return velocidad_maxima;
    }

    public color getColor(){
        return color_vehiculo;
    }

    public int getVelocidadActual(){
        return velocidad_actual;
    }

    public transmision getTransmision(){
        return transmision;
    }

    public int getMultas(){
        return multas;
    }

    /* metodos set para cambiar los atributos del objeto automovil */
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(int modelo){
        this.modelo = modelo;
    }

    public void setMotor(int motor){
        this.motor = motor;
    }

    public void setCombustible(combustible combustible){
        this.tipo_combustible = combustible;
    }

    public void setTipoAutomovil(tipo_automovil automovil){
        this.automovil = automovil;
    }

    public void setNumeroPuertas(int numero_puertas){
        this.numero_puertas = numero_puertas;
    }

    public void setCantidadAsientos(int asientos){
        this.cantidad_asientos = asientos;
    }

    public void setVelocidadMaxima(int velocidad){
        this.velocidad_maxima = velocidad;
    }

    public void setColor(color color){
        this.color_vehiculo = color;
    }

    public void setVelocidadActual(int velocidad){
        if (velocidad < 0){
            System.out.println("La velocidad no puede ser negativa");            
        }else if (velocidad > velocidad_maxima){
            System.out.println("La velocidad no puede ser superior a la maxima"); 
        }else{
            this.velocidad_actual = velocidad;
        }
    }

    public void setTransmision(transmision transmision){
        this.transmision = transmision;
    }

    public void setMultas(int numero_multas){
        this.multas = numero_multas;
    }

    /* metodos para aumentar y disminuir la velocidad actual */

    public void acelerar(int incremento_velocidad){
        /* metodo para aumentar la velocidad */

        int velocidad; // variable para guardar la velocidad nueva luego del incremento

        velocidad = velocidad_actual + incremento_velocidad; //se calcula la nueva velocidad tras el incremento
        if (velocidad > velocidad_maxima){
            System.out.println("El incremento solicitado excede la velocidad maxima");
            this.multas += 1; // en caso de intentar sobrepasar el limite de velocidad entonces se suma uno al contadro de multas
        }else{
            velocidad_actual = velocidad; // en otro caso, el incremento es permitido, y se guarda el nuevo valor de velocidad
        }
    }

    public void frenar(int decremento){
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
        System.out.println("Transimision automatica: " + transmision);
    }

    public void tiene_multas(){
        if (multas == 0){
            System.out.println("El vehiculo no registra multas");
        }else{
            System.out.println("El vehiculo registra multas");
        }
    }

    public int consultar_multas(){
        System.out.println("El vehiculo registra" + multas + "multas");
        return multas;
    }
}

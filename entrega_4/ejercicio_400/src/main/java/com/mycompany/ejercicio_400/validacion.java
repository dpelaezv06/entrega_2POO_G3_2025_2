/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_400;

/**
 *
 * @author daniel
 */
public class validacion {

    public static double calcularCociente(double numerador, double denominador){
        double cociente = 0;
        try {
            if (denominador != 0) {
                cociente = numerador / denominador;
                return cociente;
            }
            cociente = numerador / denominador;
            return cociente;
            }
            
            catch (ArithmeticException e){
                System.out.println("División por cero");
                return cociente;
            }


        
    }
    
    public static String obtenerTexto(String mensaje){
        try{
            if (mensaje.isEmpty() == false) {
                return mensaje;
            }

        }
        catch (Exception e){
            System.out.println("Ocurrió una excepción");
            return ("Error: " + e.getMessage());
    }
    return ("Texto vacío");
    }
}

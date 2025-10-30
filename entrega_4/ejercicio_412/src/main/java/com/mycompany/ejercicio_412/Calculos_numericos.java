/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_412;
import java.util.*;


/**
 *
 * @author daniel
 */
public class Calculos_numericos {
    public static double calcular_logaritmoNatural(double numero){
        double resultado = 0;
        try {
            if (numero < 0){
                throw new ArithmeticException("No se puede calcular el logaritmo natural de un número negativo.");            
            }
            resultado = Math.log(numero);
            return resultado;     
        } catch (ArithmeticException e){
            System.out.println("No se puede calcular el logaritmo natural de un número negativo.");
            return resultado;
        } catch (InputMismatchException e){
            System.out.println("Error: Entrada inválida. Por favor, ingrese un número válido.");
            return resultado;
        }
    }

    public static double calcular_raizCuadrada(double numero){
        double resultado = 0;
        try {
            if (numero < 0){
                throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");            
            }
            resultado = Math.sqrt(numero);
            return resultado;            
        } catch (ArithmeticException e){
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
            return resultado;
        } catch (InputMismatchException e){
            System.out.println("Error: Entrada inválida. Por favor, ingrese un número válido.");
            return resultado;
        }
    }
    
}

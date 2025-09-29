package com.mycompany;

public class Trapecio {
    int base1;
    int base2;
    int altura;
    int lado1;
    int lado2;

    /** 
     * @param base1  /base inferior del trapecio
     * @param base2 /base superrior del trapecio
     * @param altura /altura del trapecio
     * @param lado1 /lado izquierdo del trapecio
     * @param lado2 / lado derecho del trapecio
    **/
    Trapecio(int base1, int base2, int altura, int lado1, int lado2){
    this.base1 = base1;
    this.base2 = base2;
    this.altura = altura;
    this.lado1 = lado1;
    this.lado2 = lado2;
    }
    /**
     * Método que calcula el área del trapecio
     * **/

    double calcularArea(){
        return (base1+base2)*altura/2;
    }
    /**
     * Método que cálcula el perímetro del trapecio 
     * **/
    double calcularPerimetro(){
        return lado1+lado2+base1+base2;
    }
}

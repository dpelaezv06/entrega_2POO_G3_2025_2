package com.mycompany;

public class Rombo {
    int diagonal1;
    int diagonal2;


    /** 
     * @param diagonal1  /diagonal del rombo
     * @param diagonal2 /segunda diagonal del rombo
    **/
    Rombo(int diagonal1, int diagonal2){
    this.diagonal1 = diagonal1;
    this.diagonal2 = diagonal2;

    }

    /**
     * Método que calcula el área del rombo
     * **/

    double calcularArea(){
        
        return diagonal1*diagonal2/2;
    }
    /**
     * Método que cálcula el perímetro del trapecio 
     * **/
    double calcularPerimetro(){
        double suma_diagonales_medias_al_cuadrado = ((Math.pow(diagonal1,2))/2) + ((Math.pow(diagonal2, 2))/2);
        double longitud_Lado = Math.pow(suma_diagonales_medias_al_cuadrado,0.5);

        return 4*longitud_Lado;
    }

}

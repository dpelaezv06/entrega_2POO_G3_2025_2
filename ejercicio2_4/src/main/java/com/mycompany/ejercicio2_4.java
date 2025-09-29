package com.mycompany;
/* author: julperezca@unal.edu.co */


public class ejercicio2_4 {
    public static void main(String[] args) {
    Circulo figura1 = new Circulo(2);
    Rectangulo figura2 = new Rectangulo(1,2);
    Cuadrado figura3 = new Cuadrado(3);
    TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
    Rombo figura5 = new Rombo(4, 3);
    Trapecio figura6 = new Trapecio(8, 6, 4, 5, 5);
    System.out.println("El area del circulo es = " + figura1.calcularArea() + " u^2");
    System.out.println("El perimetro del circulo es = " + figura1.
    calcularPerimetro() + " u");
    System.out.println();
    System.out.println("El area del rectángulo es = " + figura2.
    calcularArea() + " u^2");
    System.out.println("El perimetro del rectángulo es = " + figura2.
    calcularPerimetro() + " u");
    System.out.println();
    System.out.println("El area del cuadrado es = " + figura3.
    calcularArea() + " u^2");
    System.out.println("El perimetro del cuadrado es = " + figura3.
    calcularPerimetro() + " u");
    System.out.println();
    System.out.println("El area del triangulo es = " + figura4.
    calcularArea() + " u^2");
    System.out.println("El perimetro del triangulo es = " + figura4.
    calcularPerimetro() + " u");
    figura4.determinarTipoTriangulo();

    System.out.println("El area del Rombo es = " + figura5.
    calcularArea() + " u^2");
    System.out.println("El perimetro del Rombo es = " + figura5.
    calcularPerimetro() + " u");

    System.out.println("El area del Trapecio es = " + figura6.
    calcularArea() + " u^2");
    System.out.println("El perimetro del Trapecio es = " + figura6.
    calcularPerimetro() + " u");
    }

}
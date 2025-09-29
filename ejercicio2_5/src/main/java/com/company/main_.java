package com.company;

import com.company.CuentaBancaria.tipo;

public class main_ {
    public static void main(String[] args) {
        CuentaBancaria cuenta = 
        new CuentaBancaria("Pedro","Pérez", 123456789,tipo.AHORROS,
         0);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        cuenta.interes_mensual();
    }

}

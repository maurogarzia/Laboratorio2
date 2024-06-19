package org.example;

import org.example.Cuenta.Banco;
import org.example.Cuenta.Cuenta;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.agregarCuenta("12345",1500);
        banco.agregarCuenta("23456", 1600);

        System.out.println(banco.consultarSaldo("12345"));
        banco.depositar("12345",3000);
        banco.retirar("12345", 1000);
    }
}
package org.example.Cuenta;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private Set<Cuenta> cuentas;

    public Banco() {
        this.cuentas = new HashSet<>();
    }

    public Set<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Set<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    //Metodos
    public void agregarCuenta(String numeroCuenta, double saldoInicial) {
        cuentas.add(new Cuenta(numeroCuenta, saldoInicial));
    }

    public double consultarSaldo(String numeroCuenta) {
        for (Cuenta account : cuentas) {
            if (account.getNumeroCuenta().equals(numeroCuenta)) {
                return account.getSaldo();
            }
        }
        throw new IllegalArgumentException("El numero de cuenta no existe");
    }


    public void depositar(String numeroCuenta, double monto) {
        System.out.println("Saldo anterior: " + consultarSaldo(numeroCuenta));
        if (monto < 0) {
            throw new IllegalArgumentException("El monto no puede ser negativo");
        } else {
            for (Cuenta cuenta : cuentas) {
                if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                    cuenta.setSaldo(cuenta.getSaldo() + monto);
                }
            }
        }
        System.out.println("Saldo nuevo: " + consultarSaldo(numeroCuenta));
    }

    public void retirar(String numeroCuenta, double monto){
        System.out.println("Saldo anterior: " + consultarSaldo(numeroCuenta));

        if (monto < 0){
            throw new IllegalArgumentException("El monto no puede ser negativo");
        }
        for (Cuenta cuenta : cuentas){
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)){
                if (cuenta.getSaldo() < monto){
                    throw new IllegalArgumentException("No se puede retirar un monto mas elevado al saldo");
                }else {
                    cuenta.setSaldo(cuenta.getSaldo() - monto);
                }
            }
        }
        System.out.println("Saldo nuevo: " + consultarSaldo(numeroCuenta));
    }
}


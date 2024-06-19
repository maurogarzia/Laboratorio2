package org.example.Ejercicio1;

import org.example.Cuenta.Banco;
import org.junit.jupiter.api.*;

public class BancoTest {
    private Banco banco;
    @BeforeEach
    void setUp() {
        banco = new Banco();
    }

    @Test
    void testAgregarCuenta() {
        banco.agregarCuenta("12345", 1500);
        Assertions.assertEquals(1500, banco.consultarSaldo("12345"));
    }

    @Test
    void testConsultarSaldoCuentaExistente() {
        banco.agregarCuenta("12345", 1500);
        Assertions.assertEquals(1500, banco.consultarSaldo("12345"));
    }

    @Test
    void testConsultarSaldoCuentaInexistente() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            banco.consultarSaldo("99999");
        });
        Assertions.assertEquals("El numero de cuenta no existe", exception.getMessage());
    }

    @Test
    void testDepositarMontoPositivo() {
        banco.agregarCuenta("12345", 1500);
        banco.depositar("12345", 500);
        Assertions.assertEquals(2000, banco.consultarSaldo("12345"));
    }

    @Test
    void testDepositarMontoNegativo() {
        banco.agregarCuenta("12345", 1500);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            banco.depositar("12345", -500);
        });
        Assertions.assertEquals("El monto no puede ser negativo", exception.getMessage());
    }

    @Test
    void testRetirarMontoPositivo() {
        banco.agregarCuenta("12345", 1500);
        banco.retirar("12345", 500);
        Assertions.assertEquals(1000, banco.consultarSaldo("12345"));
    }

    @Test
    void testRetirarMontoNegativo() {
        banco.agregarCuenta("12345", 1500);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("12345", -500);
        });
        Assertions.assertEquals("El monto no puede ser negativo", exception.getMessage());
    }

    @Test
    void testRetirarMontoMayorAlSaldo() {
        banco.agregarCuenta("12345", 1500);
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            banco.retirar("12345", 2000);
        });
        Assertions.assertEquals("No se puede retirar un monto mas elevado al saldo", exception.getMessage());
    }

}

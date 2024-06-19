package org.example.Ejercicio1;

import org.junit.jupiter.api.*;

class UsuarioTest {
    Usuario usuario;

    @Test
    @BeforeEach
    void inMetodoTest(){
        this.usuario = new Usuario("Mauro",21);
        System.out.println("Iniciando el metodo");
    }

    @AfterEach
    void tearDown(){
        System.out.println("Finalizando metodo");
    }

    @Test
    @DisplayName("probando nombre")
    void testNombreUsuario(){
        String esperado = "Mauro";
        String real = usuario.getNombre();
        Assertions.assertEquals(esperado,real);
    }

    @Test
    @DisplayName("probando edad")
    void testEdadUsuario(){
        int esperado = 21;
        int real = usuario.getEdad();
        Assertions.assertEquals(esperado, real);
        Assertions.assertTrue(usuario.getEdad() > 0);
    }

    @Test
    @DisplayName("Probando establecer edad")
    void testEstablecerEdad(){
        usuario.establecerEdad(-4); //Tira expecion
    }




}
package org.example.Ejercicio1;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public void establecerNombre(String name){
        setNombre(name);
    }

    public int obtenerEdad(){
        return this.edad;
    }

    public void establecerEdad(int age){
        if (age < 0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        setEdad(age);
    }
}

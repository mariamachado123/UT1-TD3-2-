package main;

public class Perro {

    private String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void ladrar() {
        System.out.println("wof");
    }

    public boolean respondeA(String unNombre) {
        System.out.println(nombre.equals(unNombre));
        return true;
    }
}

package main;

public class mainmaquinaA {
    public class Main {
        public static void main(String[] args) {
            Perro perro = new Perro("Perro");
            perro.ladrar();
            perro.respondeA(perro.getNombre());
        }
    }
}
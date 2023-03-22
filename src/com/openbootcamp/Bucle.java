package com.openbootcamp;

public class Bucle {
    public static void main(String[] args) {
        String[] nombres ={"Juan","Pedro","Rusel"};
        String nombreConcat = "";
        for(String nombre :nombres) {
            nombreConcat += nombre;
        }
        System.out.println(nombreConcat);
    }
}

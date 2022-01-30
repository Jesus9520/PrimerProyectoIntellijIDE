package com.sofka.proyect;

public class Validacion {
    public boolean validarTexto(String datos) {

        return datos.length() > 3;

    }

    public boolean validarNumero(String numero) {
        if(numero.length()==10) {
            try {
                Long.parseLong(numero);
                return true;
            } catch (NumberFormatException nfe) {
                return false;
            }
        }
        return false;

    }

    public boolean validarEdad(int edad) {

        return (edad >= 18 && edad <= 99);


    }
}



package com.sofka.proyect;

import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        Validacion validarDatos = new Validacion();

        System.out.println("Digite su nombre completo");

        String nombre = sca.nextLine();

        while (!validarDatos.validarTexto(nombre)) {
            System.out.println("Nombre incorrecto, por favor digite uno mayor a 3 letras");
            nombre = sca.nextLine();

        }
        System.out.println("Digitar su numero de celular");
        String numerocelular = sca.nextLine();

        while (!validarDatos.validarNumero(numerocelular)){
            System.out.println("Numero incorrecto,digite nuevamente su numero de celular correctamente");
            numerocelular = sca.nextLine();
        }

        System.out.println("Digite su edad");
        int edad = sca.nextInt();

        while (!validarDatos.validarEdad(edad)){
            System.out.println("El rango de edad permitido es de 18 a 99 años, digite nuavemente su edad");
            edad = sca.nextInt();

        }



        System.out.println("Bienvenido señor "+ nombre +"  , es un placer para nosotros contar con una persona de "+ edad +" años.\n" +
                "\n" +
                "Próximamente nos comunicaremos con usted al numero "+ numerocelular +".\n" +
                "\n" +
                "Feliz día");


    }
}

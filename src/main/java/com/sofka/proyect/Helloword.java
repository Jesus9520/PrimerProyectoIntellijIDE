package com.sofka.proyect;

import javax.swing.*;
import java.util.Scanner;

public class Helloword {
    public static void main(String[] args) {
       String dato;
       dato= JOptionPane.showInputDialog("Ingrese un Dato");
       JOptionPane.showMessageDialog(null, "El dato ingresado es " + dato);
    }
}

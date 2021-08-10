/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio3;

import java.util.*;
import java.io.*;
import java.lang.*;
/**
 *
 * @author Pablo
 */
public class Programa4 {
    public static void main(String[] args)
    {
        int cant, mont;
        double com, sal;
        Scanner letra = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de carros vendidos: ");
        cant = letra.nextInt();
        System.out.println("Ingrese el monto total de los carros vendidos: ");
        mont = letra.nextInt();
        com = mont * 0.05;
        sal = 1000 + (150 * cant) + com;
        System.out.println("El salario a cobrar total es de: " + sal+"$");
        
    }
}

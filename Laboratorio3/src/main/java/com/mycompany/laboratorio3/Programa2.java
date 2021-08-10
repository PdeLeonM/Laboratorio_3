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
public class Programa2 {
    public static void main(String[] args)
    {
       int horas,suel,total;
       Scanner letra = new Scanner(System.in);
       System.out.println("Ingrese las horas trabajadas: ");
       horas = letra.nextInt();
       System.out.println("Ingrese sueldo por hora: ");
       suel = letra.nextInt();
       total = horas*suel;
       System.out.println("El salario semanal es de: " + total);
    }
}

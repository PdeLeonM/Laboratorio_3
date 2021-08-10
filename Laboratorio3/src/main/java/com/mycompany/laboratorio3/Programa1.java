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
public class Programa1 {
    public static void main(String[] args)
    {
        int num1,num2,num3,suma;
        Scanner letra = new Scanner (System.in);
        System.out.println("Ingrese la nota del primer curso: ");
        num1=letra.nextInt();
        System.out.println("Ingrese la nota del segundo curso: ");
        num2=letra.nextInt();
        System.out.println("Ingrese la nota del tercer curso: ");
        num3=letra.nextInt();
        suma = num1 + num2 +num3;
        System.out.println("La suma es de: " + suma);  
    }
}

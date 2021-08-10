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
public class Programa6 {
    public static void main(String[] args)
    {
        double a,b,op;
        Scanner letra = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        a=letra.nextInt();
        System.out.println("Ingrese el valor de B: ");
        b=letra.nextInt();
        op=Math.pow(a,2)+ Math.pow(b,2) + (2*a*b);
        System.out.println("El resultado de la suma al cuadrado es: a+b^2=" +op); 
    }
}

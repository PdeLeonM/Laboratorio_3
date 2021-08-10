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
public class Programa3 {
    public static void main (String[] args)
    {
        int rod,and,est,total;
        Scanner letra = new Scanner(System.in);
        System.out.println("Ingrese los dolares de Rodrigo: ");
        rod=letra.nextInt();
        and = rod/2;
        est = (rod+and)/2;
        total = rod+and+est;
        System.out.println("Rodrigo tiene: " + rod + "$");
        System.out.println("Andrea tiene: " + and + "$");
        System.out.println("Esteban tiene: " + est + "$");
        System.out.println("Los tres tienen un total de: " +total + "$");  
    }
}

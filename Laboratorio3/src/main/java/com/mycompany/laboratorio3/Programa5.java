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
public class Programa5 {
    public static void main(String[] args)
    {
        int part,par1,par2,exaf;
        double nota1,nota2,nota3,nota4,total;
        Scanner letra = new Scanner(System.in);
        System.out.println("Ingrese la nota de participacion sobre 100pts: ");
        part=letra.nextInt();
        System.out.println("Ingrese la nota del primer parcial sobre 100pts: ");
        par1=letra.nextInt();
        System.out.println("Ingrese la nota del segundo parcial sobre 100pts: ");
        par2=letra.nextInt();
        System.out.println("Ingrese la nota del examen final sobre 100pts: ");
        exaf=letra.nextInt();
        nota1=part*0.1;
        nota2=par1*0.25;
        nota3=par2*0.25;
        nota4=exaf*0.4;
        total=nota1+nota2+nota3+nota4;
        System.out.println("La nota final es de:" + total);
        
       
    }
}

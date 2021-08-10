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
public class Programa7 {
    public static void main(String[] args)
    {
       int toth,sem,dia,hor;
       Scanner Teclado= new Scanner(System.in);
       System.out.println("Ingrese las horas a convertir: ");
       toth=Teclado.nextInt();
       sem=toth/(24*7);
       dia=toth % (24*7)/24;
       hor=toth % 24;
       System.out.println("El tiempo fue de: " + hor + " hora(s) " + dia + " dia(s) y " + sem + " semana(s)."); 
    }
}

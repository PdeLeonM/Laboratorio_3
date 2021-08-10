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
public class Programa8 {
    public static void main(String[] args)
    {
      double a,b,c;
      double div,result,resul2,e;
      Scanner letra = new Scanner(System.in);
      System.out.println("Ingrese la variable de a: ");
      a=letra.nextDouble();
      System.out.println("Ingrese la variable de b: ");
      b=letra.nextDouble();
      System.out.println("Ingrese la variable de c: ");
      c=letra.nextDouble();
      div=((Math.pow(b,2))-((4*a*c)));
      result=((-b+Math.sqrt(Math.pow(b, 2)-((4*a*c)))));
      resul2=((-b-(Math.sqrt(Math.pow(b, 2)-((4*a*c))))));
      e=(-((b)/(2*a)));
      if(div>0){
          System.out.println("x1 = " +result/(2*a));
          System.out.println("x2 = " +resul2/(2*a));
      }else if(div==0) {
          System.out.println("x1 = " +e);
          System.out.println("x2 = " +e);      
      }else{
          System.out.println("No existe solucion");
      }  
    }
}

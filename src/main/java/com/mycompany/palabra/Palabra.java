/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palabra;
import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class Palabra {

    public static void main(String[] args) { 
        String cadena;
        Scanner entrada=new Scanner(System.in);
         System.out.println("Ingresa una palabra");
        cadena = entrada.nextLine();
        contadorVocales(cadena);
        contadorConsonantes(cadena);
        contadorNumeros(cadena);
    }  
    public static void contadorVocales(String cadena)
    {
        String vocales="aeiou";
        int contador = 0;
        
        for(int i=0;i<cadena.length();i++)
        {
            for(int j=0;j<vocales.length();j++)
            {
                if(cadena.charAt(i)==vocales.charAt(j))
                {
                    contador++;
                }
            }
        }   
         System.out.println("Aparecen vocales: "+contador+" veces");        
    }
    public static void contadorConsonantes(String cadena)
    {
        String vocales="bcdfghjklmnñpqrstvwxyz";
        int contador = 0;
        
        for(int i=0;i<cadena.length();i++)
        {
            for(int j=0;j<vocales.length();j++)
            {
                if(cadena.charAt(i)==vocales.charAt(j))
                {
                    contador++;
                }
            }
        }   
         System.out.println("Aparecen consonantes: "+contador+" veces");        
    }
    public static void contadorNumeros(String cadena)
    {
        String vocales="0123456789";
        int contador = 0;
        
        for(int i=0;i<cadena.length();i++)
        {
            for(int j=0;j<vocales.length();j++)
            {
                if(cadena.charAt(i)==vocales.charAt(j))
                {                   
                    contador++;
                }
            }
        }   
         System.out.println("Aparecen números: "+contador+" veces");        
    }   
}

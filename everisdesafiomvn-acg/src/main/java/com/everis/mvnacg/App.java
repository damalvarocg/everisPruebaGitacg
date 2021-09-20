package com.everis.mvnacg;

import org.apache.commons.lang3.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String nombre = "alvaro";
        System.out.println( StringUtils.capitalize(nombre) );
        System.out.println( StringUtils.chop(nombre) );
        
        //añado el print de hola mundo que se pide en el ejercicio
        System.out.println( "Hola mundo!" );
        
        //añado también el saludo
        System.out.println( "Hola, Alvaro!" );
    }
}

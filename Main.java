package main;

import java.util.Scanner;
     
    public class Main {

    public static void main(String[] args) {

    int primero = 0;

    int segundo = 1 ;

    int siguiente;

        System.out.println("1");

    while(primero<10000){
        siguiente = primero + segundo;

        primero = segundo;

        segundo = siguiente;

        System.out.println(siguiente);

    }

    }

}
/* Elaborado por: Andres Felipe Cardona Londoño
                  Juan David Arias Sanchez
*/

    


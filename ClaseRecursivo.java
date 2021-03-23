
package main;


public class ClaseRecursivo {
    
    public static int recursivo (int numero){
        if (numero > 1){
            return recursivo (numero - 1) + recursivo (numero - 2);
        }else{
         if (numero ==1) return 1;
         else return 0;     
        }
      
    }
    
}
/* Elaborado por: Andres Felipe Cardona Londoño
                  Juan David Arias Sanchez
*/
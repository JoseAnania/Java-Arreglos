
package ejercitaciónpráctica;

import java.util.Scanner;

public class EjercitaciónPráctica {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner (System.in);
        
        System.out.println("Cantidad de números a cargar");
        int cantNumeros=SC.nextInt();
        
        int [] numeros;
        numeros=new int[cantNumeros];
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Ingrese Nº"+(1+i));
            numeros[i]=SC.nextInt();
        }
        
        System.out.println("Los números ingresados son: ");
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println(numeros[i]);
            
        }
    }
    
}

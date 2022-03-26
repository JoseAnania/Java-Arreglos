
package tareaclase1;

import java.util.Scanner;

public class TareaClase1 {

    public static void main(String[] args) {
        
        float acumulador=0;
        
        Scanner SC=new Scanner (System.in);
        
        System.out.println("Cantidad de números a ingresar: ");
        
        int cantidad=SC.nextInt();
        
        int [] numeros;
        numeros=new int[cantidad];
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Ingrese el número "+(i+1));
            numeros[i]=SC.nextInt();
            
            acumulador+=numeros[i];
        }    
        
        float promedio=(acumulador/cantidad);
        
        System.out.println("El promedio es: "+promedio);
        
        System.out.println("Listados de números menores al promedio: ");
        
        for (int i = 0; i < numeros.length; i++) {
            
            if (numeros[i]<promedio)
            {
                System.out.println(numeros[i]);
            }
        }
        
        System.out.println("Listado de números mayores al promedio: ");
        
        for (int i = 0; i < numeros.length; i++) {
            
            if(numeros[i]>promedio)
            {
                System.out.println(numeros[i]);
            }
            
        }
    }
    
}

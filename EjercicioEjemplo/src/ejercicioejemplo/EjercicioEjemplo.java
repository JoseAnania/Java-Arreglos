
package ejercicioejemplo;

import java.util.Scanner;

public class EjercicioEjemplo {


    public static void main(String[] args) {
        
        int acumN=0;
        int mayor=0;
        int menor=0;
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cargar 10 números: ");
        
        int [] numeros;
        numeros=new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println("Ingrese el Nº"+(1+i));
            numeros[i]=SC.nextInt();
            
            acumN+=numeros[i];
            
            if(numeros[i]>mayor)
            {
                mayor=numeros[i];
            }
            
            if(numeros[i]<menor)
            {
                menor=numeros[i];
            }
            
        }
        
        System.out.println("Suma= "+acumN);
        
        System.out.println("Promedio= "+(float)acumN/numeros.length);
        
        System.out.println("Mayor= "+mayor);
        
        System.out.println("Menor= "+menor);
    }
    
}

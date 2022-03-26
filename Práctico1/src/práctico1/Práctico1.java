
package práctico1;

import java.util.Scanner;

public class Práctico1 {

    public static void main(String[] args) {
        
        float acumulador=0;
        int contador5=0;

        Scanner SC=new Scanner(System.in);
        
        int [] numeros;
        
        numeros=new int [10];
        
        System.out.println("Ingrese 10 números");
        
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println((i+1));
            numeros[i]=SC.nextInt();
            
            acumulador+=numeros[i];
            
        }
        
        System.out.println("La suma de los números ingresados es: "+acumulador);
        System.out.println("El promedio de los números ingresados es: "+(acumulador/10));
        
        System.out.println("Cantidad de números mayores a 5: ");
        for (int i = 0; i < numeros.length; i++) {
            
            if(numeros[i]>5)
            {
                contador5++;
            }
        }
        System.out.println(contador5);
    }
    
}

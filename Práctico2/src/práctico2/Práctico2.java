
package práctico2;

import java.util.Scanner;

public class Práctico2 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner (System.in);
        
        System.out.println("Cantidad de nombres a ingresar: ");
        int cantidad=SC.nextInt();
        
        String [] nombres;
        nombres=new String[cantidad];
        
        System.out.println("Ingrese "+cantidad+" nombres");
        
        for (int i = 0; i < nombres.length; i++) {
            
            nombres[i]=SC.next();
            
        }
        
        System.out.println("Nombres ingresados que empiezan con A: ");
        
        for (int i = 0; i < nombres.length; i++) {
            
            if(nombres[i].charAt(0)=='A')
            {
                System.out.println(nombres[i]);
            }
            
        }
        
        
    }
    
}


package tareaclase2;

import java.util.Scanner;

public class TareaClase2 {

    public static void main(String[] args) {
        
        int contador=0;
        int contadorA=0;
        
        Scanner SC=new Scanner(System.in);
        
        String [] nombres;
        
        System.out.println("Cantidad de nombres a Ingresar: ");
        int cantidad=SC.nextInt();
        
        nombres=new String[cantidad];
        
        for (int i = 0; i < nombres.length; i++) {
            
            System.out.println("Ingrese el Nombre "+(i+1));
            nombres[i]=SC.next();
            
            contador++;
        }
        
        System.out.println("Los nombres ingresados son: "+contador);
        for (int i = 0; i < nombres.length; i++) {
            
            System.out.println((i+1)+"-"+nombres[i]);
        }
        
        System.out.println("Nombres que empiezan con A: ");
        for (int i = 0; i < nombres.length; i++) {
            
            if(nombres[i].startsWith("A"))
            {
                System.out.println(nombres[i]);
                
                contadorA++;
            }          
        }
        System.out.println("Cantidad de nombres que empiezan con A: "+contadorA);  
    }
    
}

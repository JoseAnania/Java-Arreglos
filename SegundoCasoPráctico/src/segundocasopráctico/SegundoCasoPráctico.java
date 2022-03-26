
package segundocasopráctico;

import java.util.Scanner;

public class SegundoCasoPráctico {


    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Cantidad de Alumnos");
        int cantAlumnos=SC.nextInt();
        
        for (int i = 0; i < cantAlumnos; i++) {
            
            System.out.println("Cantidad de notas del Alumno "+(1+i));
            int cantNotas=SC.nextInt();
            
            Nota N=new Nota(cantNotas);
            
            for (int j = 0; j < cantNotas; j++) {
                
                System.out.println("Nota "+(1+j));
                int nota=SC.nextInt();
                
                N.agregarNota(nota);
                
            }
        System.out.println("Promedio del Alumno: "+N.calcularPromedio());
        }
    }
    
}


package práctico3;

import java.util.Scanner;

public class Práctico3 {

    public static void main(String[] args) {
        
        float aNotas=0;
        int cPromedio8=0;
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Ingrese nombre del Curso: ");
        String nombreCurso=SC.next();
        
        System.out.println("Cantidad de inscriptos al curso "+nombreCurso);
        int cantidadAlumnos=SC.nextInt();
        
        Alumno [] alumnos=new Alumno [cantidadAlumnos];//Crea el vector (carga NULL en cada índice)
        
        for (int i = 0; i < alumnos.length; i++) {
            
            Alumno A=new Alumno();//Llama al constructor de la clase, crea un objeto
            
            System.out.println("Nombre del Alumno "+(i+1));
            A.setNombre(SC.next());
            
            System.out.println("Legajo de "+A.getNombre());
            A.setLegajo(SC.nextInt());
            
            System.out.println("Promedio de "+A.getNombre());
            A.setPromedio(SC.nextFloat());
            
            alumnos[i]=A;//Cargo en cada índice el objeto
            
        }
        System.out.println("Listado de Inscriptos: ");
        
        for (int i = 0; i < alumnos.length; i++) {
            
            System.out.println(alumnos[i].toString());
            
        }
        
        for (int i = 0; i < alumnos.length; i++) {
            
            aNotas+=alumnos[i].getPromedio();
        }
        
        float promedio=(aNotas/cantidadAlumnos);
        
        System.out.println("Promedio general del Curso " +nombreCurso+" : "+promedio);
        
        for (int i = 0; i < alumnos.length; i++) {
            
            if(alumnos[i].getPromedio()>8)
            {
                cPromedio8++;
            }
        }
        System.out.println("Cantidad de alumnos con promedio mayor a 8: "+cPromedio8);
    }
    
    
}

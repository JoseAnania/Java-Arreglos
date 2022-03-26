
package tareaguía1;

import java.util.Scanner;


public class TareaGuía1 {


    public static void main(String[] args) {
        
        float acumPG=0;
        int cont8=0;
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Nombre del Curso: ");
        String nombreCurso=SC.next();
        
        System.out.println("Cantidad de Inscriptos al curso "+nombreCurso);
        int cantidadAlumnos=SC.nextInt();
        
        Alumno [] alumnos = new Alumno [cantidadAlumnos];
        
        for (int i = 0; i < alumnos.length; i++) {
            
            System.out.println("Nombre del alumno "+(1+i));
            String nombre=SC.next();
            
            System.out.println("Legajo de "+nombre);
            int legajo=SC.nextInt();
            
            System.out.println("Cantidad de Notas de "+nombre);
            int cantidadNotas=SC.nextInt();
            
            Alumno A=new Alumno(nombre, legajo, cantidadNotas);
            
            for (int j = 0; j < cantidadNotas; j++) {
                
                System.out.println("Nota "+(1+j));
                int nota=SC.nextInt();
                
               
                
                A.agregarNota(nota);
            }
            
            System.out.println("Promedio de "+nombre+" : "+A.calcularPromedio());
            alumnos[i]=A;
            
        }
        
        System.out.println("Listado de Inscriptos: ");
        for (int i = 0; i < alumnos.length; i++) {
            
            System.out.println(alumnos[i].getNombre());
            
        }
        
        
        float promedioGeneral=0;
        
        for (int i = 0; i < alumnos.length; i++) {
            
            acumPG+=alumnos[i].calcularPromedio();
            
        }
        promedioGeneral=acumPG/alumnos.length;
        
        System.out.println("Promedio General del Curso: "+promedioGeneral);
        
        for (int i = 0; i < alumnos.length; i++) {
            
            if(alumnos[i].calcularPromedio()>8)
            {
                cont8++;
            }
            
        }
        System.out.println("Cantidad de Alumnos con promedio mayor a 8: "+cont8);
    }
    
}

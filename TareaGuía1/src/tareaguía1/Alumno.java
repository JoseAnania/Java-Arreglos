
package tareaguía1;

public class Alumno {
    
    private String nombre;
    private int legajo;
    private int [] notas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Alumno() {
    }

    public Alumno(String nombre, int legajo, int cantidadNotas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notas = new int [cantidadNotas];
    }
    
    public void agregarNota(int nuevaNota)
    {
        for (int i = 0; i < notas.length; i++) {
            if(notas[i]==0)
            {
                notas[i]=nuevaNota;
                break;
            }            
        }
    }
    
    public float calcularPromedio()
    {
        float acumPromedio=0;
        float promedio=0;
        
        for (int i = 0; i < notas.length; i++) {
            
            acumPromedio+=notas[i];
            
            promedio=acumPromedio/notas.length;
            
        }
        return promedio;
    }
    
}

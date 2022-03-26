
package práctico3;

public class Alumno {
    
    private String nombre;
    private int legajo;
    private float promedio;

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

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Alumno() {
    }

    public Alumno(String nombre, int legajo, float promedio) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.promedio = promedio;
    }
    
    public String toString()
    {
        return nombre;
    }
    
}

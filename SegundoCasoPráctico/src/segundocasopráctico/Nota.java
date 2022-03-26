
package segundocasopráctico;

public class Nota {
    
    private int[]notas;

    public Nota(int cantNotas) {
        this.notas = new int[cantNotas];
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
        float promedio=0;
        float acumP=0;
        
        for (int i = 0; i < notas.length; i++) {
            
            acumP+=notas[i];
            
            promedio=acumP/notas.length;
        }
        return promedio;
    }
    
}

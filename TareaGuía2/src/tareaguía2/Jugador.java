
package tareaguía2;

public class Jugador {
    
    public String nombre;
    private int posición;
    private int numero;
    private int pj;
    private int estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosición() {
        return posición;
    }

    public void setPosición(int posición) {
        this.posición = posición;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPj() {
        return pj;
    }

    public void setPj(int pj) {
        this.pj = pj;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Jugador(String nombre, int posición, int numero, int pj, int estado) {
        this.nombre = nombre;
        this.posición = posición;
        this.numero = numero;
        this.pj = pj;
        this.estado = estado;
    }
    
    
    
}


package tareaguía2;

public class Equipo {
    
    public String nombreEquipo;
    private int puntos;
    private int pg;
    private int pe;
    private int pp;
    private int gf;
    private int gc;
    private int posicionFinal;
    private Jugador[]jugadores;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }

    public int getPe() {
        return pe;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getGf() {
        return gf;
    }

    public void setGf(int gf) {
        this.gf = gf;
    }

    public int getGc() {
        return gc;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }

    public int getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionFinal(int posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    public Equipo(String nombreEquipo, int puntos, int pg, int pe, int pp, int gf, int gc, int posicionFinal, int cantJugadores) {
        this.nombreEquipo = nombreEquipo;
        this.puntos = puntos;
        this.pg = pg;
        this.pe = pe;
        this.pp = pp;
        this.gf = gf;
        this.gc = gc;
        this.posicionFinal = posicionFinal;
        this.jugadores = new Jugador[cantJugadores];
    }
    
    public void agregarJugador(Jugador nuevoJugador)
    {
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i]==null)
            {
                jugadores[i]=nuevoJugador;
                break;
            }
        }
    }
    
    public int menosPartidos()
    {
        int cont10=0;
        
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].getPj()<10)
            {
                cont10++;
            }
            
        }
        return cont10;
    }
    
    public String nombreMayor()
    {
        String nombre="";
        int mayor=0;
        
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].getPj()>mayor)
            {
                mayor=jugadores[i].getPj();
                nombre=jugadores[i].getNombre();
            }           
        }
        return nombre;
    }
    
    public float promedioEstado()
    {
        float acumEstado=0;
        int contJug=0;
        
        for (int i = 0; i < jugadores.length; i++) {
            
            acumEstado+=jugadores[i].getEstado();
            contJug++;
            
        }
        return (acumEstado/contJug);
    }
    
    public int estadoJugador(int numero)
    {
        int estado=0;
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].getNumero()==numero)
            {
                estado+=jugadores[i].getEstado();
            }
        }
        return estado;
    }
    
    public float promedioJugados(int posicion)
    {
        float acumJug=0;
        int contJug=0;
        
        for (int i = 0; i < jugadores.length; i++) {
            if(jugadores[i].getPosición()==posicion)
            {
                acumJug+=jugadores[i].getPj();
                contJug++;
            }
        }
        return (acumJug/contJug);
    }
    
}

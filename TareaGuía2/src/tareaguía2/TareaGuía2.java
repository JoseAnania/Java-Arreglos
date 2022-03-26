
package tareaguía2;

import java.util.Scanner;

public class TareaGuía2 {

    public static void main(String[] args) {
        
        Scanner SC=new Scanner(System.in);
        
        System.out.println("Nombre del Equipo: ");
        String nombreEq=SC.next();
        
        System.out.println("Puntos obtenidos: ");
        int puntos=SC.nextInt();
        
        System.out.println("Partidos Ganados: ");
        int pg=SC.nextInt();
        
        System.out.println("Partidos Empatados: ");
        int pe=SC.nextInt();
        
        System.out.println("Partidos Perdidos: ");
        int pp=SC.nextInt();
        
        System.out.println("Goles a Favor: ");
        int gf=SC.nextInt();
        
        System.out.println("Goles en Contra: ");
        int gc=SC.nextInt();
        
        System.out.println("Posición Final: ");
        int posFinal=SC.nextInt();
        
        System.out.println("Cantidad de jugadores que integran la plantilla: ");
        int cantJugadores=SC.nextInt();
        
        Equipo E=new Equipo(nombreEq, puntos, pg, pe, pp, gf, gc, posFinal, cantJugadores);
        
        for (int i = 0; i < cantJugadores; i++) {
            
            System.out.println("Nombre del Jugador: ");
            String nombre=SC.next();
            
            System.out.println("Posición: (1: Arquero / 2: Defensor / 3: Medio / 4: Delantero)");
            int posicion=SC.nextInt();
            
            System.out.println("Número de Camiseta: ");
            int numero=SC.nextInt();
            
            System.out.println("Cantidad de partidos Jugados: ");
            int pj=SC.nextInt();
            
            System.out.println("Porcentaje de Estado Físico: ");
            int estado=SC.nextInt();
            
            Jugador J=new Jugador(nombre, posicion, numero, pj, estado);
            
            E.agregarJugador(J);
        }
        
        System.out.println("Cantidad de jugadores con menos de 10 partidos jugados: "+E.menosPartidos());
        
        System.out.println("Nombre del jugador con más partidos jugados: "+E.nombreMayor());
        
        System.out.println("Promedio de Estado Físico del equipo: "+E.promedioEstado());
        
        System.out.println("Estado Físico del Jugador que usa la camiseta Nº4: "+E.estadoJugador(4)+"%");
        
        System.out.println("Promedio de Partidos Jugados por Arqueros: "+E.promedioJugados(1));
        
        System.out.println("Promedio de Partidos Jugados por Defensores: "+E.promedioJugados(2));
        
        System.out.println("Promedio de Partidos Jugados por Medios: "+E.promedioJugados(3));
        
        System.out.println("Promedio de Partidos Jugados por Delanteros: "+E.promedioJugados(4));
    }
    
}

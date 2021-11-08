import java.util.*;

public class Alumno {
    private int numeroBoleta;
    private String nombre;
    private ArrayList<Materia> materiaCursa;
    private Grupo grupo;
    private int grado;
    
    private static int alumnos=0;
    
    public Alumno(String nombreAl,int boleta,int grado){
        nombre=nombreAl;
        this.grado=grado;
        numeroBoleta=boleta;
        materiaCursa= new ArrayList<>();
        alumnos++;
    }
    public static int numAlumnos(){
        return alumnos;
    }
    public void agregarMateria(Materia m){
        materiaCursa.add(m);
    }
    
    public String toString(){
        return "Numero de boleta: "+numeroBoleta+"\nNombre: "+nombre;
    }
    
    public int getGrado(){
        return grado;
    }
    
    public void imprimirMaterias (){
        int i=1;
        for(Materia aux: materiaCursa){
            System.out.println("Materia ["+i+"] que cursa:"+aux.getMateria());
            i++;
        }
    }
    
}

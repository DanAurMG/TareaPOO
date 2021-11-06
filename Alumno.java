import java.util.ArrayList;
public class Alumno {
    private int numeroBoleta;
    private String nombre;
    private ArrayList<Materia> materiaCursa;
    
    private static int alumnos=0;
    
    public Alumno(String m,int boleta){
        nombre=m;
        numeroBoleta=boleta;
        materiaCursa= new ArrayList<>();
        alumnos++;
    }
    
    public void agregarMateria(Materia m){
        materiaCursa.add(m);
    }
    
    public String toString(){
        return "Numero de boleta: "+numeroBoleta+"\nNOmbre: "+nombre;
    }
    
    public void imprimirMaterias (){
        for(Materia aux: materiaCursa){
            System.out.println(aux);
        }
    }
    
}

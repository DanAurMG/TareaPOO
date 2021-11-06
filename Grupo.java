import java.util.ArrayList;
public class Grupo {
    private String nombre;
    private ArrayList <Alumno> alumnos;
    private Profesor prof;
    
    private static int numGrupos=0;
    
    public Grupo(String nombre){
        this.nombre=nombre;
        numGrupos++;
        alumnos=new ArrayList<>();
    }
    
    public void asignarProf (Profesor p){
        prof=p;
    }
    
    public void addAlumno(Alumno a){
        alumnos.add(a);
    }
    
    public void mostrarAlumnos(){
        for(Alumno aux : alumnos){
            System.out.println(aux);
        }
    }
    
    public String  getNomGrup(){
        return nombre;
    }
    
    public Profesor  getProf(){
        return prof;
    }
    
    public static int numGrupos(){
        return numGrupos;
    }
    
}


import java.util.*;

public class Escuela {
    private ArrayList<Materia> materias;
    private ArrayList<Grupo> grupos;
    //private ArrayList<Alumno> alumnos; NO se si sea conveninete meterlos en esta parte ya que estan contenidos en el grupo xd
    private ArrayList<Profesor> profesores;
    private String nombreEscuela;
    
    public Escuela(String nombre){
        nombreEscuela=nombre;
        materias=new ArrayList<>();
        grupos=new ArrayList<>();
        profesores=new ArrayList<>();
    }
    
    public void agregarMateria(Materia m){
        materias.add(m);
    }
    public void agregarGrupo(Grupo m){
        grupos.add(m);
    }
    public void agregarProfesor(Profesor m){
        profesores.add(m);
    }
    
    public void imprimirDatosGen(){
        System.out.println("Numero de grupos: "+Grupo.numGrupos());
        for(Grupo aux: grupos){
            System.out.println("Nombre del grupo: "+aux.getNomGrup());
            System.out.println("Profesor asignado a grupo: "+aux.getProf().getNomProfesor());
        }
        
        System.out.println("NUmero de materias: "+Materia.numMaterias());
        for(Materia aux: materias){
            System.out.println("Nombre de la materia: "+aux.getMateria());
            
        }
        System.out.println("NUmero de profesores: "+Profesor.numProf());
        for(Profesor aux: profesores){
            System.out.println(aux.getNomProfesor());//usa Tostring  
        }
        
        System.out.println("Numero de alumnos: "+Alumno.numAlumnos());
        for(Grupo aux: grupos){
            aux.mostrarAlumnos();
        }
    }  
    
}

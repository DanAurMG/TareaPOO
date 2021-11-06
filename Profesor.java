import java.util.ArrayList;
public class Profesor {
    private String nombre;
    private ArrayList <Materia> materiaImparte;
    private ArrayList <Grupo>  grupo;
    
    private static int numeroProf=0;
    
    public Profesor(String n){
        nombre=n;
        materiaImparte=new ArrayList<>();
        grupo=new ArrayList<>();
        numeroProf++;
    }
    
    public void addMateria(Materia materia){
        materiaImparte.add(materia);
    }
    
    public void addGrupo(Grupo g){
        grupo.add(g);
    }
    
    public String toString (){
        return "Nombre: "+nombre;
    }
    
    public void imprimirGrupos(){
        for(Grupo aux:grupo){
            System.out.println(aux);
        }
    }
    public void imprimirMaterias(){
        for(Materia aux: materiaImparte){
            System.out.println(aux);
        }
    }
    
    public static int numProf (){
        return numeroProf;
    }
}

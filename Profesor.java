public class Profesor {
    private String nombre;
    private ArrayList <Materia> materiaImparte;
    private ArrayList <String>  grupo;
    
    private static int numeroProf=0;
    
    public Profesor(String n){
        nombre=n;
        materiaImparte=new ArrayList<>();
        numeroProf++;
    }
    
    public void setMateria(Materia materia){
        materiaImparte.add(materia);
    }
    
    public void setGrupo(String grupo){
        this.grupo.add(grupo);
    }
    
    public String toString (){
        return "Nombre: "+nombre;
    }
    
    public void imprimirGrupos(){
        for(String aux:grupo){
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

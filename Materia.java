public class Materia {
    private String nombre;
    private int grado;
    
    private static int materias=0;
    
    public Materia(String nombre, int grado){
        this.nombre=nombre;
        this.grado=grado;
        materias++;
    }
    public static int numMaterias(){
        return materias;
    }
    
    public String toString (){
        return "Materia: "+nombre+"\nGrado del Materia: "+grado;
    }
    
}


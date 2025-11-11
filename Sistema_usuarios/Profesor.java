
//crear la clase
public class Profesor extends Usuario{
    //Atributos
    private String horario_clases;
    private String asignatura;

    //creando constructor sobrecargado
    public Profesor(String nombre, int id, String password, String asignatura){
        super(nombre, id, password);
        this.asignatura = asignatura;
    }
    //constructor vacío
    public Profesor(){}


    //zona de metodos
    public void setHorario_clases(String horario_clases){
        this.horario_clases = horario_clases;
    }

    public String getHorario_clases(){
        return horario_clases;
    }

    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }

    public String getAsignatura(){
        return asignatura;
    }

    public void administrar_notas(){
        System.out.println("administrando notas");
    }

    public void enviar_reportenotas(){
        System.out.println("notas enviadas");
    }

    public void agregarNota(){
        System.out.println("agregando nota");
    }

    public void removerNota(){
        System.out.println("removiendo nota");
    }
}

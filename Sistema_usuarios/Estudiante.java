
//crear la clase
public class Estudiante extends Usuario{
    //Atributos
    private String horario_clases;
    private String curso;


    //creando constructor
    public Estudiante(String nombre, int id, String password, String curso){
        super(nombre, id, password);
        this.curso = curso;

    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setHorario_clases(String horario_clases) {
        this.horario_clases = horario_clases;
    }

    public String getHorario_clases() {
        return horario_clases;
    }

    //zona de metodos
    public void subir_trabajos(){
        System.out.println("subiendo trabajos");
    }

    public void actualizar_info(){
        System.out.println("informacion actualizada");
    }

}

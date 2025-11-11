//crear la clase
public class Admin extends Usuario{
    //Atributos
    private String horario_trabajo;

    //creando constructor
    public Admin(String nombre, int id, String password){
        super(nombre, id, password);
    }

    //zona de metodos
    public void setHorario_trabajo(String horario_trabajo){
        this.horario_trabajo = horario_trabajo;
    }

    public String getHorarioTrabajo() {
        return horario_trabajo;
    }

    public void asignarPermisos() {
        System.out.println("Asignando permisos de administrador...");
    }
    public void editarNota()
    {
        System.out.println("Editando notas...");
    }

    public void eliminarNota()
    {
        System.out.println("Eliminando nota...");
    }
    public void crearNota()
    {
        System.out.println("Creando nota...");
    }

    public void agregarUsuario(){
        System.out.println("Agregando usuario...");
    }

    public void eliminarUsuario(){
        System.out.println("Eliminando usuario...");
    }
}

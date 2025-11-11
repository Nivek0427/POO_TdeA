//crando la clase
public class Usuario {
    //crear atributos
    private String nombre;
    private int id;
    private String password;

    //crear constructor sobrecargado
    public Usuario(){}
    public Usuario(String nombre,int id, String password){
        this.nombre = nombre;
        this.id=id;
        this.password=password;
    }

    public String getNombre() {
        return nombre;
    }

    //zona de metodos
    //metodo para loggearse
    public void loggear(int id, String password){
        System.out.println("ha ingresado con exito"+id+"");
    }
    //meotod para leer notas
    public void leernotas(){
        System.out.println("leyendo notas");
    }


}
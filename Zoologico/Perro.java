public class Perro extends Mamifero {

    //atributos
    private String raza;


    //constructor
    public Perro(String nombre, int edad, double peso, double altura, int periodoGestacion, String raza) {
        super(nombre, edad, peso, altura, periodoGestacion); // Llamada al constructor de la clase Mamifero
        this.raza = raza;
  
    }

    //métodos getters y setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //método específico de la clase Perro
    public void jugar() {
        System.out.println(getNombre() + " está jugando.");
    }
    
}

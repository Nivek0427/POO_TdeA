public class Gato extends Mamifero {

    //atributos
    private int habilidadCaza; //nivel del 1 al 10
    
    //constructor
    public Gato(String nombre, int edad, double peso, double altura, int periodoGestacion, int habilidadCaza) {
        super(nombre, edad, peso, altura, periodoGestacion); // Llamada al constructor de la clase Mamifero
        this.habilidadCaza = habilidadCaza;
    }

    //métodos getters y setters
    public int getHabilidadCaza() {
        return habilidadCaza;
    }
    public void setHabilidadCaza(int habilidadCaza) {
        this.habilidadCaza = habilidadCaza;
    }

    //método específico de la clase Gato
    public void ronronear() {
        System.out.println(getNombre() + " está ronroneando.");
    }

}

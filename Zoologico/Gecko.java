public class Gecko extends Reptil {

    //atributos
    private boolean autotomia; //capacidad de perder la cola

    //constructor
    public Gecko(String nombre, int edad, double peso, double altura, String tipoEscamas, boolean esVenenoso,
                    int frecuenciaMuda, boolean autotomia) {
        super(nombre, edad, peso, altura, tipoEscamas, esVenenoso, frecuenciaMuda); // Llamada al constructor de la clase Reptil
        this.autotomia = autotomia;
    }

    //métodos getters y setters
    public boolean isAutotomia() {
        return autotomia;
    }
    public void setAutotomia(boolean autotomia) {
        this.autotomia = autotomia;
    }

    //método específico de la clase Gecko
    public void perderCola() {
        if (autotomia) {
            System.out.println(getNombre() + " ha perdido su cola para escapar de un depredador.");
        } else {
            System.out.println(getNombre() + " no puede perder su cola.");
        }
    }
    
}

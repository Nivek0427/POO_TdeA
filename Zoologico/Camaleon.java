public class Camaleon extends Reptil {
    //atributos
    private boolean capacidadCamuflaje; //capacidad de cambiar de color

    //constructor
    public Camaleon(String nombre, int edad, double peso, double altura, String tipoEscamas, boolean esVenenoso, 
                        int frecuenciaMuda, boolean capacidadCamuflaje) {
        super(nombre, edad, peso, altura, tipoEscamas, esVenenoso, frecuenciaMuda);
        this.capacidadCamuflaje = capacidadCamuflaje;
    }

    //métodos getters y setters
    public boolean isCapacidadCamuflaje() {
        return capacidadCamuflaje;
    }
    public void setCapacidadCamuflaje(boolean capacidadCamuflaje) {
        this.capacidadCamuflaje = capacidadCamuflaje;
    }

    //métodos específicos de Camaleón
    public void camuflarse() {
        if (capacidadCamuflaje) {
            System.out.println(getNombre() + " está cambiando de color para camuflarse.");
        } else {
            System.out.println(getNombre() + " no tiene la capacidad de camuflarse.");
        }
    }
    
}

//crear la clase
public class Mamifero extends Animal{
    //atributos
    private int periodoGestacion; //en dias

    //constructor
    public Mamifero(String nombre, int edad, double peso, double altura, int periodoGestacion){
        super(nombre, edad, peso, altura);
        this.periodoGestacion = periodoGestacion;
 
    }
    //métodos getters y setters
    public int getPeriodoGestacion(){
        return periodoGestacion;
    }
    public void setPeriodoGestacion(int periodoGestacion){
        this.periodoGestacion = periodoGestacion;
    }

    //métodos específicos de Mamífero
    public void amamantar(){
        System.out.println(getNombre() + " está amamantando a sus crías.");
    }



}
